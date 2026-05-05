package Ast.Jinja;

import Ast.ASTNode;
import Ast.BlockNode;

public class JinjaForNode extends ASTNode {
    private final ASTNode loopVar;
    private final ASTNode iterable;
    private final BlockNode body;

    public JinjaForNode(ASTNode loopVar, ASTNode iterable, BlockNode body, int lineNumber) {
        super("JinjaForNode", lineNumber);
        this.loopVar = loopVar;
        this.iterable = iterable;
        this.body = body;
    }

    public ASTNode getLoopVar() {
        return loopVar;
    }

    public ASTNode getIterable() {
        return iterable;
    }

    public BlockNode getBody() {
        return body;
    }

    @Override
    public String toString() {
        return nodeName + "(line=" + lineNumber + ")";
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent)
                .append(nodeName)
                .append(" [Line: ").append(lineNumber).append("]\n");

        sb.append(indent).append("  LoopVar:\n");
        if (loopVar != null) {
            sb.append(loopVar.print(indent + "    "));
        }

        sb.append(indent).append("  Iterable:\n");
        if (iterable != null) {
            sb.append(iterable.print(indent + "    "));
        }

        sb.append(indent).append("  Body:\n");
        if (body != null) {
            sb.append(body.print(indent + "    "));
        }

        return sb.toString();
    }
}
