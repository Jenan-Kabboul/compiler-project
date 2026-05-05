package Ast.Python;

import Ast.ASTNode;

public class LiteralNode extends ASTNode {
    private Object value;
    private String type; // "String", "Number", "Boolean"

    public LiteralNode(Object value, String type, int lineNumber) {
        super("Literal", lineNumber);
        this.value = value;
        this.type = type;
    }
    public String getType() {
        return type;
    }

    @Override
    public String print(String indent) {
        return indent + "Node: " + nodeName + " [Line: " + lineNumber + "] Type: " + type + ", Value: " + value + "\n";
    }
}