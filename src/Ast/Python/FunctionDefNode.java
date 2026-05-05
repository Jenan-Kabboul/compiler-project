package Ast.Python;

import Ast.ASTNode;
import Ast.BlockNode;

import java.util.ArrayList;
import java.util.List;

public class FunctionDefNode extends ASTNode {
    private String name;
    private List<String> params;
    private BlockNode body;

    public FunctionDefNode(String name, int lineNumber) {
        super("FunctionDef", lineNumber);
        this.name = name;
        this.params = new ArrayList<>();
    }

    public void addParam(String param) {
        this.params.add(param);
    }

    public void setBody(BlockNode body) {
        this.body = body;
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Node: ").append(nodeName)
                .append(" [Line: ").append(lineNumber).append("] Name: ").append(name).append("\n");
        sb.append(indent).append("  Params: ").append(params).append("\n");
        sb.append(body.print(indent + "  "));
        return sb.toString();
    }
}
