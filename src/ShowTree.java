import java.nio.file.Paths;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

import antlr.exampleParser;
import antlr.exampleLexer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;


public class ShowTree {
    static String inputPath = "tests/python_test.txt";
    static String startRule = "program";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                run(startRule);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    static void run(String startRule) throws Exception {
        CharStream input = CharStreams.fromPath(Paths.get(inputPath));

        exampleLexer lexer = new exampleLexer(input);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        exampleParser parser = new exampleParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new DiagnosticErrorListener());

        ParseTree tree = invokeStartRule(parser, startRule);

        TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewer.setScale(1.2);

        JScrollPane scroll = new JScrollPane(viewer);

        JFrame frame = new JFrame("Parse Tree Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(scroll);
        frame.setSize(1000, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    static ParseTree invokeStartRule(exampleParser parser, String ruleName) throws Exception {
        java.lang.reflect.Method m = parser.getClass().getMethod(ruleName);
        return (ParseTree) m.invoke(parser);
    }
}
