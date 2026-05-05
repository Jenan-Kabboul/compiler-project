package Ast;

public abstract class ASTNode {
    protected String nodeName;
    protected int lineNumber;

    public ASTNode(String nodeName, int lineNumber) {
        this.nodeName = nodeName;
        this.lineNumber = lineNumber;
    }

    public abstract String print(String indent);

    public String getNodeName() { return nodeName; }
    public int getLineNumber() { return lineNumber; }
}