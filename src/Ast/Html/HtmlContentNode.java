package Ast.Html;

import Ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class HtmlContentNode extends ASTNode {
    private final List<ASTNode> children;

    public HtmlContentNode(int lineNumber) {
        super("HtmlContentNode", lineNumber);
        this.children = new ArrayList<>();
    }

    public void addChild(ASTNode child) {
        this.children.add(child);
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent);
        sb.append("Content:\n");

        for (ASTNode child : children) {
            String childIndent = indent + "  ";
            sb.append(child.print(childIndent));
        }

        return sb.toString();
    }
}