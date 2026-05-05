package Ast.Css;

import Ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class CssBlockNode extends ASTNode {// يحتوي على قواعد CSS المختلفة


    private final List<ASTNode> children;

    public CssBlockNode(int lineNumber) {
        super("CssBlockNode", lineNumber);
        this.children = new ArrayList<>();  // ← دايماً ArrayList مش List.of()
    }

    public List<ASTNode> getChildren() {

        return children;
    }

    // الحين تقدر تضيف SelectorRuleNode أو ClassSelectorNode
    public void addRule(ASTNode rule) {  // ← ASTNode مش SelectorRuleNode
        this.children.add(rule);
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("CSS BLOCK [Line: ").append(lineNumber).append("]\n");
        for (ASTNode child : children) {
            sb.append(child.print(indent + "  "));
        }
        return sb.toString();
    }

    public static class ClassSelectorNode extends SelectorRuleNode {

        private final String className;
        private final SelectorNode pseudoSelector;

        // === هذا هو الـ Constructor الجديد الذي يطلبه الفيزيتور ===
        public ClassSelectorNode(String className,
                                 SelectorNode pseudoSelector,
                                 List<DeclarationNode> declarations,
                                 int lineNumber) {

            // نمرر الـ declarations للأب (SelectorRuleNode) مباشرة
            super(null, declarations, lineNumber);

            this.className = className;
            this.pseudoSelector = pseudoSelector;
        }

        public String getClassName() {
            return className;
        }

        public SelectorNode getPseudoSelector() {
            return pseudoSelector;
        }

        @Override
        public String print(String indent) {
            StringBuilder sb = new StringBuilder();
            sb.append(indent).append("Class Selector: ").append(className).append("\n");

            if (pseudoSelector != null) {
                sb.append(pseudoSelector.print(indent + "  "));
            }

            // طباعة التصريحات الموجودة في الأب
            if (getDeclarations() != null && !getDeclarations().isEmpty()) {
                sb.append(indent).append("  Declarations:\n");
                for (DeclarationNode decl : getDeclarations()) {
                    sb.append(decl.print(indent + "    "));
                }
            }

            return sb.toString();
        }
    }
}