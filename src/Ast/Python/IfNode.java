package Ast.Python;

import Ast.ASTNode;
import Ast.BlockNode;

public class IfNode extends ASTNode {
    private ASTNode condition;
    private BlockNode thenBlock;
    private BlockNode elseBlock;

    public IfNode(ASTNode condition, BlockNode thenBlock, BlockNode elseBlock, int line) {
        super("If", line);
        this.condition = condition;
        this.thenBlock = thenBlock;
        this.elseBlock = elseBlock;
    }

    public BlockNode getThenBlock() {
        return thenBlock;
    }

    public BlockNode getElseBlock() {
        return elseBlock;
    }

    public ASTNode getCondition() {
        return condition;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("If (").append(condition != null ? condition.print("") : "null").append(")\n");
        sb.append(indent).append("Then:\n");
        if (thenBlock != null) {
            sb.append(thenBlock.print(indent + "  "));
        }
        if (elseBlock != null) {
            sb.append(indent).append("Else:\n");
            sb.append(elseBlock.print(indent + "  "));
        }
        return sb.toString();
    }

}