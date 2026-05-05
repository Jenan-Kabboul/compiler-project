import Ast.ProgramNode;
import antlr.exampleLexer;
import antlr.exampleParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import Visitor.ASTBuilderVisitor;
import Ast.ASTNode;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // 1. مسار الملف اللي بدك تقرأه (تأكد إنه داخل مجلد المشروع أو حط المسار الكامل)
        String fileName = "flask_app/templates/product_details.html";

        System.out.println("========================================");
        System.out.println("Reading File: " + fileName);
        System.out.println("========================================");

        try {
            // 2. القراءة من ملف مباشرة
            CharStream input = CharStreams.fromFileName(fileName);

            // 3. إعداد الـ Lexer مع مستمع للأخطاء
            exampleLexer lexer = new exampleLexer(input);
            lexer.removeErrorListeners();
            lexer.addErrorListener(ConsoleErrorListener.INSTANCE);

            // 4. تحويل الـ Lexer لـ Tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // 5. إعداد الـ Parser مع مستمع للأخطاء
            exampleParser parser = new exampleParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(ConsoleErrorListener.INSTANCE);

            // 6. بناء الـ Parse Tree (البداية من قاعدة program)
            ParseTree tree = parser.program();

            // 7. تحويل الـ Parse Tree لـ AST باستخدام الـ Visitor
            ASTBuilderVisitor visitor = new ASTBuilderVisitor();
            ASTNode astRoot = visitor.visit(tree);

            // 8. طباعة النتيجة النهائية
            System.out.println("\n Final Abstract Syntax Tree (AST) \n");
            if (astRoot != null) {
              //  System.out.println(astRoot.print(""));
                // استدعاء الدالة الجديدة لطباعة الشج
                    System.out.println(" Tree Map ");
                    // يجب عمل Cast لأن astRoot معرف كـ ASTNode والدالة في ProgramNode
                    ((ProgramNode) astRoot).printDetailedTree();

                System.out.println("\n AST Processed Successfully ");
            } else {
                System.out.println("Failed to build AST (Root is null). Check your grammar or input file structure.");
            }

        } catch (IOException e) {
            System.err.println("خطأ: لم نتمكن من العثور على الملف أو قراءته.");
            System.err.println("المسار المستخدم: " + fileName);
        } catch (Exception e) {
            System.err.println("حدث خطأ أثناء عملية الـ Parsing:");
            e.printStackTrace();
        }
    }
}