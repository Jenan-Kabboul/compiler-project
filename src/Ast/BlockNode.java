package Ast;

import java.util.ArrayList;
import java.util.List;

public class BlockNode extends ASTNode {
    private final List<ASTNode> children;

    // Overload 1: بلوك فارغ مع رقم السطر
    public BlockNode(int line) {
        this(new ArrayList<>(), line);
    }

    // Overload 2: بلوك مع قائمة أطفال + رقم السطر
    public BlockNode(List<ASTNode> children, int line) {
        super("Block", line);
        this.children = (children != null) ? children : new ArrayList<>();
    }

    public List<ASTNode> getChildren() {
        return children;
    }

    // إضافة جملة جديدة إلى البلوك
    public void addStatement(ASTNode stmt) {
        children.add(stmt);
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Block\n");
        for (ASTNode child : children) {
            if (child != null) {
                sb.append(child.print(indent + " "));
            }
        }
        return sb.toString();
    }
}
