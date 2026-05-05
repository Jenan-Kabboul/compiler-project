package Ast.Jinja;

import Ast.ASTNode;
import Ast.BlockNode;

public class JinjaIfNode extends ASTNode {
    private final ASTNode condition;
    private final BlockNode thenBlock;
    private final BlockNode elseBlock;

    public JinjaIfNode(ASTNode condition, BlockNode thenBlock, BlockNode elseBlock, int lineNumber) {
        super("JinjaIfNode", lineNumber);
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }

    public ASTNode getCondition() { return condition; }
    public BlockNode getThenBlock() { return thenBlock; }
    public BlockNode getElseBlock() { return elseBlock; }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append(nodeName).append(" [Line: ").append(lineNumber).append("]\n");
        if (condition != null) {
            sb.append(indent).append("  Condition:\n").append(condition.print(indent + "    "));
        }
        if (thenBlock != null) {
            sb.append(indent).append("  Then:\n").append(thenBlock.print(indent + "    "));
        }
        if (elseBlock != null) {
            sb.append(indent).append("  Else:\n").append(elseBlock.print(indent + "    "));
        }
        return sb.toString();
    }
}
