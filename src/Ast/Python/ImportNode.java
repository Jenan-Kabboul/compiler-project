package Ast.Python;

import Ast.ASTNode;

public class ImportNode extends ASTNode {
    private String moduleName;

    public ImportNode(String moduleName, int lineNumber) {
        super("ImportStmt", lineNumber);
        this.moduleName = moduleName;
    }

    @Override
    public String print(String indent) {
        return indent + "Node: " + nodeName + " [Line: " + lineNumber + "] Module: " + moduleName + "\n";
    }
}