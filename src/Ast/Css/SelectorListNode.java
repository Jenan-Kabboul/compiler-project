package Ast.Css;

import Ast.ASTNode;
import java.util.List;

public class SelectorListNode extends ASTNode {
    private final List<SelectorNode> selectors;

    public SelectorListNode(List<SelectorNode> selectors, int lineNumber) {
        super("SelectorListNode", lineNumber);
        this.selectors = selectors;
    }

    public List<SelectorNode> getSelectors() {
        return selectors;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("SelectorList [Line: ").append(lineNumber).append("]\n");
        for (SelectorNode sel : selectors) {
            sb.append(sel.print(indent + "  "));
        }
        return sb.toString();
    }
}