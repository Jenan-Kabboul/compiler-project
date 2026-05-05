package Ast.Css;

import Ast.ASTNode;
import java.util.List;

public class DeclarationNode extends ASTNode {
    private final String property; // مثل 'color'
    private final List<ValueNode> values; // قائمة القيم مثل ['red', 'blue']

    public DeclarationNode(String property, List<ValueNode> values, int lineNumber) {
        super("DeclarationNode", lineNumber);
        this.property = property;
        this.values = values;
    }

    public String getProperty() { return property; }
    public List<ValueNode> getValues() { return values; }

    @Override
    public String print(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(indent).append("Property: ").append(property).append("\n");
        for (ValueNode val : values) {
            sb.append(val.print(indent + "    "));
        }
        return sb.toString();
    }
}