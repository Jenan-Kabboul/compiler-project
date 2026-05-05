package Visitor;

import Ast.*;
import Ast.Css.*;
import Ast.Html.*;
import antlr.exampleParser;
import antlr.exampleParserBaseVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.Token;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class ASTBuilderVisitor extends exampleParserBaseVisitor<ASTNode> {

    /* ================= PROGRAM ================= */
    @Override
    public ASTNode visitProgram(exampleParser.ProgramContext ctx) {
        ProgramNode program = new ProgramNode(ctx.getStart().getLine());
        // زيارة كل القواعد (Blocks) المباشرة المكونة للبرنامج
        ctx.children.stream()
                .filter(c -> !(c instanceof TerminalNode))
                .map(this::visit)
                .forEach(node -> { if(node != null) program.addStatement(node); });
        return program;
    }

    /* ================= HTML VISITOR METHODS ================= */

    @Override
    public ASTNode visitHtmlNormal(exampleParser.HtmlNormalContext ctx) {
        // 1. استخراج الوسم (مثل <div>)
        HtmlElementNode element = (HtmlElementNode) visit(ctx.htmlOpen());

        // 2. معالجة المحتوى مع دمج النصوص
        if (ctx.htmlContent() != null) {
            StringBuilder textAccumulator = new StringBuilder();

            for (var child : ctx.htmlContent().children) {
                ASTNode node = visit(child);

                // إذا كان "تاغ" داخلي (مثل <strong> داخل <p>)
                if (node != null) {
                    // قبل إضافة التاغ، أضف أي نصوص مجموعة قبله
                    addAccumulatedText(element, textAccumulator, ctx.getStart().getLine());
                    element.addChild(node);
                }
                // إذا كان "توكن" نصي (كلمة، حرف، رقم)
                else if (child instanceof TerminalNode tn) {
                    int tokenType = tn.getSymbol().getType();

                    // تجاهل المسافات الفارغة تماماً (Trim)
                    String rawText = tn.getText();

                    // تجاهل الـ INDENT/DEDENT والأسطر الفارغة
                    if (tokenType == exampleParser.INDENT || tokenType == exampleParser.DEDENT || rawText.trim().isEmpty()) {
                        continue;
                    }

                    // جمع النص مع الكلمات السابقة
                    textAccumulator.append(rawText).append(" ");
                }
            }
            // إضافة أي نص متبقي في نهاية التاغ
            addAccumulatedText(element, textAccumulator, ctx.getStart().getLine());
        }
        return element;
    }

    // دالة مساعدة لتنظيف وإضافة النص المجمع (أضيفيها في أسفل الكلاس)
    private void addAccumulatedText(HtmlElementNode element, StringBuilder accumulator, int line) {
        if (accumulator.length() > 0) {
            String finalContent = accumulator.toString().trim();
            if (!finalContent.isEmpty()) {
                element.addChild(new HtmlTextNode(finalContent, line));
            }
            accumulator.setLength(0); // تصفير الجامع للمرة القادمة
        }
    }

    @Override
    public ASTNode visitHtmlOpenRule(exampleParser.HtmlOpenRuleContext ctx) {
        // الوصول المباشر لاسم التاج عن طريق الدالة التي ولدها ANTLR
        HtmlElementNode element = new HtmlElementNode(ctx.HTML_TAG_NAME().getText(), ctx.getStart().getLine());

        // استخراج الصفات مباشرة
        ctx.attribute().forEach(attr -> element.addAttribute((AttributeNode) visit(attr)));
        return element;
    }

    @Override
    public ASTNode visitHtmlAttribute(exampleParser.HtmlAttributeContext ctx) {
        String name = ctx.ATTRIBUTE_NAME().getText();
        String value = (ctx.ATTRIBUTE_VALUE() != null)
                ? ctx.ATTRIBUTE_VALUE().getText().replaceAll("^['\"]|['\"]$", "")
                : null;
        return new AttributeNode(name, value, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitHtmlSelfCloseTag(exampleParser.HtmlSelfCloseTagContext ctx) {
        HtmlSelfCloseNode element = new HtmlSelfCloseNode(ctx.HTML_TAG_NAME_SELF_CLOSE().getText(), ctx.getStart().getLine());
        ctx.attribute().forEach(attr -> element.addAttribute((AttributeNode) visit(attr)));
        return element;
    }

    @Override
    public ASTNode visitHtmlDoctypeDecl(exampleParser.HtmlDoctypeDeclContext ctx) {
        return new DoctypeNode(ctx.HTML_TAG_NAME().getText(), ctx.getStart().getLine());
    }

    /* ================= CSS VISITOR METHODS ================= */

    @Override
    public ASTNode visitCssBlockRule(exampleParser.CssBlockRuleContext ctx) {
        CssBlockNode block = new CssBlockNode(ctx.getStart().getLine());
        ctx.selectorRule().forEach(rule -> block.addRule(visit(rule)));
        return block;
    }

    // التعامل مع Label: #CssSelectorList
    @Override
    public ASTNode visitCssSelectorList(exampleParser.CssSelectorListContext ctx) {
        List<DeclarationNode> decls = ctx.declaration().stream()
                .map(d -> (DeclarationNode) visit(d)).collect(Collectors.toList());

        return new SelectorRuleNode((SelectorListNode) visit(ctx.selectorList()), decls, ctx.getStart().getLine());
    }

    // التعامل مع Label: #CssClassSelector
    @Override
    public ASTNode visitCssClassSelector(exampleParser.CssClassSelectorContext ctx) {
        String className = ctx.CLASS_SELECTOR().getText();
        SelectorNode pseudo = (ctx.cssSelector() != null) ? (SelectorNode) visit(ctx.cssSelector()) : null;

        List<DeclarationNode> decls = ctx.declaration().stream()
                .map(d -> (DeclarationNode) visit(d)).collect(Collectors.toList());

        return new ClassSelectorNode(className, pseudo, decls, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitCssSelectorListItems(exampleParser.CssSelectorListItemsContext ctx) {
        List<SelectorNode> selectors = ctx.cssSelector().stream()
                .map(s -> (SelectorNode) visit(s)).collect(Collectors.toList());
        return new SelectorListNode(selectors, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitCssSelectorRule(exampleParser.CssSelectorRuleContext ctx) {
        String name = ctx.SELECTOR().getText();
        String pseudo = (ctx.PSEUDO_CLASS() != null) ? ctx.PSEUDO_CLASS().getText() : null;
        return new SelectorNode(name, pseudo, ctx.getStart().getLine());
    }

    @Override
    public ASTNode visitCssDeclaration(exampleParser.CssDeclarationContext ctx) {
        String property = ctx.PROPERTY_NAME().getText();

        // استخراج القيم والفواصل كـ ValueNodes مباشرة من التوكنز
        List<ValueNode> values = ctx.children.stream()
                .filter(c -> c instanceof TerminalNode)
                .map(c -> (TerminalNode) c)
                .filter(tn -> tn.getSymbol().getType() == exampleParser.PROPERTY_VALUE ||
                        tn.getSymbol().getType() == exampleParser.COMMA_CSS)
                .map(tn -> new ValueNode(tn.getText(), tn.getSymbol().getLine()))
                .collect(Collectors.toList());

        return new DeclarationNode(property, values, ctx.getStart().getLine());
    }
}