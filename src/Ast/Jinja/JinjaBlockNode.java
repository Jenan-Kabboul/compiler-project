package Ast.Jinja;

import Ast.ASTNode;

import java.util.List;

public class JinjaBlockNode extends ASTNode {
    private final String name;
    private final List<ASTNode> statements;

    public JinjaBlockNode(String name, List<ASTNode> statements, int lineNumber) {
        super("JinjaBlockNode", lineNumber);
        this.name = name;
        this.statements = statements;
    }

    public String getName() {
        return name;
    }

    public List<ASTNode> getStatements() {
        return statements;
    }

    @Override
    public String toString() {
        return nodeName + "(name=" + name + ", size=" + (statements != null ? statements.size() : 0) + ", line=" + lineNumber + ")";
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent)
                .append(nodeName)
                .append(" [Line: ").append(lineNumber).append("] ")
                .append("Block: ").append(name).append("\n");

        if (statements != null) {
            for (ASTNode stmt : statements) {
                sb.append(stmt.print(indent + "  "));
            }
        }
        return sb.toString();
    }
}
