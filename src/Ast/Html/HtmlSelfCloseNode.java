package Ast.Html;

import Ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class HtmlSelfCloseNode extends ASTNode {
    private final String tagName;
    private final List<AttributeNode> attributes;

    public HtmlSelfCloseNode(String tagName, int lineNumber) {
        super("HtmlSelfCloseNode", lineNumber);
        this.tagName = tagName;
        this.attributes = new ArrayList<>();
    }

    public void addAttribute(AttributeNode attribute) {
        this.attributes.add(attribute);
    }

    public String getTagName() { return tagName; }
    public List<AttributeNode> getAttributes() { return attributes; }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent);
        sb.append("Self-Close Tag: ");
        sb.append(tagName);
        sb.append(" [Line: ");
        sb.append(lineNumber);
        sb.append("]\n");

        for (AttributeNode attr : attributes) {
            String childIndent = indent + "  ";
            sb.append(attr.print(childIndent));
        }

        return sb.toString();
    }
}