package Ast.Css;

import Ast.ASTNode;

public class ValueNode extends ASTNode {
    private final String value;

    public ValueNode(String value, int lineNumber) {
        super("ValueNode", lineNumber);
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String print(String indent) {
        return indent + "Value: " + value + " [Line: " + lineNumber + "]\n";
    }
}