package Ast.Html;
import Ast.ASTNode;

public class HtmlTextNode extends ASTNode {
    private final String text;
    public HtmlTextNode(String text, int lineNumber) {
        super("TextNode", lineNumber);
        this.text = text;
    }
    @Override
    public String toString() {
        // إرجاع النص الفعلي ليظهر في الشجرة
        return text.trim();
    }

    @Override
    public String print(String indent) {
        // إذا كان النص فارغاً (مسافات فقط) لا تطبعيه لتوفير مساحة
        if (text.trim().isEmpty()) return "";
        return indent + "└── [TextNode] | Code: " + text.trim() + " | Line: " + lineNumber + "\n";
    }
}