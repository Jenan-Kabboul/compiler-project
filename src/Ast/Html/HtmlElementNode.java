package Ast.Html;
import Ast.ASTNode;
import java.util.ArrayList;
import java.util.List;

public class HtmlElementNode extends ASTNode {
    private final String tagName;
    private final List<AttributeNode> attributes = new ArrayList<>();
    private HtmlContentNode content; // <<<<<< التغيير هنا: نستخدم ContentNode بدلاً من List

    public HtmlElementNode(String tagName, int lineNumber) {
        super("HtmlElementNode", lineNumber);
        this.tagName = tagName;
        // تهيئة المحتوى (يمكن أن يكون فارغاً)
        this.content = new HtmlContentNode(lineNumber);
    }

    public void addAttribute(AttributeNode attr) { attributes.add(attr); }

    // دالة مساعدة لإضافة طفل مباشرة إلى المحتوى
    public void addChild(ASTNode child) {
        this.content.addChild(child);
    }

    public String getTagName() { return tagName; }
    public List<AttributeNode> getAttributes() { return attributes; }
    public HtmlContentNode getContent() { return content; } // Getter للمحتوى

    @Override
    public String toString() {
        // سيظهر هكذا في الشجرة: <div class="container">
        StringBuilder sb = new StringBuilder("<" + tagName);
        for (AttributeNode attr : attributes) {
            sb.append(" ").append(attr.toString());
        }
        sb.append(">");
        return sb.toString();
    }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("└── [HtmlElementNode] | Code: ").append(this.toString()).append(" | Line: ").append(lineNumber).append("\n");

        // طباعة المحتوى (الأبناء)
        if (content != null) {
            sb.append(content.print(indent + "    "));
        }
        return sb.toString();
    }
}