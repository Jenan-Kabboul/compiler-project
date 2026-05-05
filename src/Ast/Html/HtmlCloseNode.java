package Ast.Html;

import Ast.ASTNode;

public class HtmlCloseNode extends ASTNode {
    private final String tagName;

    public HtmlCloseNode(String tagName, int lineNumber) {
        super("HtmlCloseNode", lineNumber);
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent);
        sb.append("Closing Tag: ");
        sb.append(tagName);
        sb.append(" [Line: ");
        sb.append(lineNumber);
        sb.append("]\n");

        return sb.toString();
    }
}