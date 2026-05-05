package Ast.Jinja;

import Ast.ASTNode;

public class JinjaExprNode extends ASTNode {
        private final ASTNode expr;
        public JinjaExprNode(ASTNode expr, int lineNumber) {
            super("JinjaExprNode", lineNumber);
            this.expr = expr;
        }
        @Override
        public String print(String indent) {
            return indent + nodeName + " [Line: " + lineNumber + "]\n"
                    + expr.print(indent + "  ");
        }
    }
