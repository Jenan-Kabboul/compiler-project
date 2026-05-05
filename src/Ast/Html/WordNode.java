package Ast.Html;

import Ast.ASTNode;

public class WordNode extends ASTNode {
    private final String text;

    public WordNode(String text, int lineNumber) {
        super("WordNode", lineNumber);
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent);
        sb.append("Word: ");
        sb.append(text);
        sb.append(" [Line: ");
        sb.append(lineNumber);
        sb.append("]\n");

        return sb.toString();
    }
}