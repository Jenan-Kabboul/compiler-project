package Ast.Html;

import Ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class HtmlBlockNode extends ASTNode {
    private final ASTNode opening;
    private final HtmlContentNode content;
    private final HtmlCloseNode closing;

    public HtmlBlockNode(ASTNode opening, HtmlContentNode content, HtmlCloseNode closing, int lineNumber) {
        super("HtmlBlockNode", lineNumber);
        this.opening = opening;
        this.content = content;
        this.closing = closing;
    }

    public ASTNode getOpening() { return opening; }
    public HtmlContentNode getContent() { return content; }
    public HtmlCloseNode getClosing() { return closing; }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();

        sb.append(indent);
        sb.append("HTML BLOCK [Line: ");
        sb.append(lineNumber);
        sb.append("]\n");

        if (opening != null) {
            String childIndent = indent + "  ";
            sb.append(opening.print(childIndent));
        }

        if (content != null) {
            String childIndent = indent + "    ";
            sb.append(content.print(childIndent));
        }

        if (closing != null) {
            String childIndent = indent + "  ";
            sb.append(closing.print(childIndent));
        }

        return sb.toString();
    }
}