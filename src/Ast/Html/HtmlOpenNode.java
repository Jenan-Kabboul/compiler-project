package Ast.Html;

import Ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class HtmlOpenNode extends ASTNode {
    private final String tagName;
    private final List<AttributeNode> attributes;

    public HtmlOpenNode(String tagName, int lineNumber) {
        super("HtmlOpenNode", lineNumber);
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
        sb.append("Open Tag: ");
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