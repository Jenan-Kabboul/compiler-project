package Ast.Css;

import Ast.ASTNode;
import java.util.List;

public class ClassSelectorNode extends SelectorRuleNode {

    private final String className;
    private final SelectorNode pseudoSelector;

    // === Constructor المحدث ===
    public ClassSelectorNode(String className,
                             SelectorNode pseudoSelector,
                             List<DeclarationNode> declarations,
                             int lineNumber) {

        // نمرر البيانات للأب (SelectorRuleNode)
        // null مكان المحددات (Selectors) لأن الكلاس هو المحدد الأساسي
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
        sb.append(indent).append("Class Selector: ").append(className);
        if (pseudoSelector != null) {
            sb.append(":").append(pseudoSelector.getName());
        }
        sb.append(" [Line: ").append(lineNumber).append("]\n");

        // طباعة التصريحات الموجودة في الأب
        if (getDeclarations() != null) {
            for (DeclarationNode decl : getDeclarations()) {
                sb.append(decl.print(indent + "    "));
            }
        }

        return sb.toString();
    }
}