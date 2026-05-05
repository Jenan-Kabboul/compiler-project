package Ast.Python;

import Ast.ASTNode;

public class VariableNode extends ASTNode {
    private String name;

    public VariableNode(String name, int lineNumber) {
        super("Variable", lineNumber);
        this.name = name;
    }

    @Override
    public String print(String indent) {
        return indent + "Node: " + nodeName + " [Line: " + lineNumber + "] Name: " + name + "\n";
    }
}