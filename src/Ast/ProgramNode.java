package Ast;

import java.util.ArrayList;
import java.util.List;

// 1. استيراد كلاسات CSS (موجودة أصلاً)
import Ast.Css.CssBlockNode;
import Ast.Css.SelectorRuleNode;
import Ast.Css.DeclarationNode;
import Ast.Css.ClassSelectorNode;
import Ast.Css.SelectorListNode;
import Ast.Css.ValueNode;
import Ast.Css.SelectorNode;
import Ast.BlockNode;

// 2. استيراد كلاسات HTML (مهم جداً للطباعة)
import Ast.Html.HtmlElementNode;
import Ast.Html.HtmlSelfCloseNode;
import Ast.Html.HtmlTextNode;
import Ast.Html.DoctypeNode;

public class ProgramNode extends ASTNode {
    private List<ASTNode> statements;

    public ProgramNode(int lineNumber) {
        super("Program", lineNumber);
        this.statements = new ArrayList<>();
    }

    public void addStatement(ASTNode stmt) {
        statements.add(stmt);
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public String  print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Node: ").append(nodeName)
                .append(" [Line: ").append(lineNumber).append("]\n");
        for (ASTNode stmt : statements) {
            sb.append(stmt.print(indent + "  "));
        }
        return sb.toString();
    }

    // ================= دالة Tree Map المفصلة (تشمل HTML و CSS) =================
    public void printDetailedTree() {
        printDetailedTree(this, "");
    }

    private void printDetailedTree(ASTNode node, String prefix) {
        if (node == null) return;

        // 1. تجهيز نص الكود
        String codeSnippet = "";

        // === (جديد) شروط HTML ===
        if (node instanceof HtmlElementNode) {
            HtmlElementNode h = (HtmlElementNode) node;
            codeSnippet = "<" + h.getTagName() + ">";
        }
        else if (node instanceof HtmlSelfCloseNode) {
            codeSnippet = "<" + ((HtmlSelfCloseNode) node).getTagName() + " />";
        }
        else if (node instanceof HtmlTextNode) {
            codeSnippet = "\"" + ((HtmlTextNode) node).toString() + "\"";
        }
        else if (node instanceof DoctypeNode) {
            codeSnippet = "<!DOCTYPE " + ((DoctypeNode) node).getValue() + ">";
        }
        // === شروط CSS ===
        else if (node instanceof SelectorNode) {
            SelectorNode s = (SelectorNode) node;
            codeSnippet = s.getName();
            if (s.getPseudoClass() != null) codeSnippet += ":" + s.getPseudoClass();
        }
        else if (node instanceof ClassSelectorNode) {
            ClassSelectorNode c = (ClassSelectorNode) node;
            String cls = c.getClassName(); // يحتوي "." من الليكسر
            codeSnippet = cls;
            if (c.getPseudoSelector() != null) {
                String pseudo = c.getPseudoSelector().getName();
                // إذا كان اسم selector عادي (مش hover) = descendant
                if (pseudo.equals("hover")) {
                    codeSnippet += ":" + pseudo;
                } else {
                    codeSnippet += " " + pseudo; // مسافة للـ descendant
                }
            }
        }
        else if (node instanceof DeclarationNode) {
            DeclarationNode d = (DeclarationNode) node;
            codeSnippet = d.getProperty() + ": ";
            if (d.getValues() != null) {
                for(int i=0; i<d.getValues().size(); i++) {
                    codeSnippet += d.getValues().get(i).getValue();
                    if(i < d.getValues().size()-1) codeSnippet += " ";
                }
            }
            codeSnippet += ";";
        }

        // 2. بناء سطر الطباعة
        StringBuilder sb = new StringBuilder();
        sb.append(prefix).append("└── [").append(node.getNodeName()).append("]");

        if (!codeSnippet.isEmpty()) {
            sb.append("  |  Code: ").append(codeSnippet);
        }

        sb.append("  |  Line: ").append(node.getLineNumber());
        System.out.println(sb.toString());

        // 3. تجهيز الأبناء
        List<ASTNode> children = null;

        // === (جديد) جلب أبناء HTML ===
        if (node instanceof HtmlElementNode) {
            if (((HtmlElementNode) node).getContent() != null) {
                children = ((HtmlElementNode) node).getContent().getChildren();
            }
        }

        // === جلب أبناء CSS والباقي ===
        else if (node instanceof ProgramNode) children = ((ProgramNode) node).getStatements();
        else if (node instanceof BlockNode) children = ((BlockNode) node).getChildren();
        else if (node instanceof CssBlockNode) children = ((CssBlockNode) node).getChildren();
        else if (node instanceof SelectorRuleNode) {
            SelectorRuleNode ruleNode = (SelectorRuleNode) node;
            children = new ArrayList<>();
            if (ruleNode.getSelectors() != null) children.add(ruleNode.getSelectors());
            if (ruleNode.getDeclarations() != null) children.addAll(ruleNode.getDeclarations());
        }
        else if (node instanceof SelectorListNode) children = new ArrayList<>(((SelectorListNode) node).getSelectors());
        // ClassSelectorNode يتم معالجته كـ SelectorRuleNode في الشرط أعلاه.

        // 4. طباعة الأبناء
        if (children != null) {
            for (int i = 0; i < children.size(); i++) {
                boolean isLast = (i == children.size() - 1);
                printDetailedTree(children.get(i), prefix + (isLast ? "    " : "│   "));
            }
        }
    }
}