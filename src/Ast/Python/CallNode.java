package Ast.Python;

import Ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

public class CallNode extends ASTNode {
    private String functionName;
    private List<ASTNode> arguments;

    public CallNode(String functionName, int lineNumber) {
        super("FunctionCall", lineNumber);
        this.functionName = functionName;
        this.arguments = new ArrayList<>();
    }

    public void addArgument(ASTNode arg) {
        arguments.add(arg);
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Node: ").append(nodeName)
                .append(" [Line: ").append(lineNumber).append("] Func: ").append(functionName).append("\n");
        for (ASTNode arg : arguments) {
            sb.append(arg.print(indent + "  "));
        }
        return sb.toString();
    }
}