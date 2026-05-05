package Ast.Python;

import Ast.ASTNode;

public class BinaryOpNode extends ASTNode {
    private ASTNode left;
    private String operator;
    private ASTNode right;

    public BinaryOpNode(ASTNode left, String operator, ASTNode right, int lineNumber) {
        super("BinaryOp", lineNumber);
        this.left = left;
        this.operator = operator;
        this.right = right;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Node: ").append(nodeName)
                .append(" [Line: ").append(lineNumber).append("] Op: '").append(operator).append("'\n");
        sb.append(left.print(indent + "  "));
        sb.append(right.print(indent + "  "));
        return sb.toString();
    }
}