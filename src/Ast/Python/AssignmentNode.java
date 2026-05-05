package Ast.Python;

import Ast.ASTNode;

public class AssignmentNode extends ASTNode {
    private String variableName;
    private ASTNode value;

    public AssignmentNode(String variableName, ASTNode value, int lineNumber) {
        super("Assignment", lineNumber);
        this.variableName = variableName;
        this.value = value;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Node: ").append(nodeName)
                .append(" [Line: ").append(lineNumber).append("] Var: ").append(variableName).append("\n");
        sb.append(value.print(indent + "  "));
        return sb.toString();
    }
}
