package Ast.Css;

import Ast.ASTNode;
import java.util.List;

public class SelectorRuleNode extends ASTNode {
    private final ASTNode selectors; // قد تكون null في حالة الـ Class Selector المباشر
    private final List<DeclarationNode> declarations;

    public SelectorRuleNode(ASTNode selectors,
                            List<DeclarationNode> declarations,
                            int lineNumber) {

        super("SelectorRuleNode", lineNumber);

        this.selectors = selectors;
        this.declarations = declarations;
    }


    public ASTNode getSelectors() {
        return selectors; }
    public List<DeclarationNode> getDeclarations() { return declarations; }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent)
                .append("CSS Rule [Line: ")
                .append(lineNumber)
                .append("]\n");

        if (selectors != null) {
            sb.append(selectors.print(indent + "  "));
        }

        sb.append(indent)
                .append("  Declarations:\n");

        for (DeclarationNode decl : declarations) {
            sb.append(decl.print(indent + "    "));
        }
        return sb.toString();
    }
}