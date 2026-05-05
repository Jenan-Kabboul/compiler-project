package Ast.Python;

import Ast.ASTNode;

public class ReturnNode extends ASTNode {
    private ASTNode returnValue;

    public ReturnNode(ASTNode returnValue, int lineNumber) {
        super("ReturnStmt", lineNumber);
        this.returnValue = returnValue;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Node: ").append(nodeName)
                .append(" [Line: ").append(lineNumber).append("]\n");
        sb.append(returnValue.print(indent + "  "));
        return sb.toString();
    }
}