// Generated from C:/Users/Jenan/Desktop/Compiler_project-main/Compiler_project-main/grammars/exampleParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link exampleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface exampleParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link exampleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(exampleParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonStatement(exampleParser.PythonStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PythonImport}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonImport(exampleParser.PythonImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PythonComment}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonComment(exampleParser.PythonCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PythonAssign}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonAssign(exampleParser.PythonAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PythonExpr}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonExpr(exampleParser.PythonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PythonList}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonList(exampleParser.PythonListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PythonFuncDef}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonFuncDef(exampleParser.PythonFuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PythonReturn}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonReturn(exampleParser.PythonReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PythonDecorator}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonDecorator(exampleParser.PythonDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PythonIf}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonIf(exampleParser.PythonIfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PythonNewline}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonNewline(exampleParser.PythonNewlineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtImport}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtImport(exampleParser.StmtImportContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtAssign(exampleParser.StmtAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtExpr}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtExpr(exampleParser.StmtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtList}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtList(exampleParser.StmtListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtReturn(exampleParser.StmtReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StmtDecorator}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmtDecorator(exampleParser.StmtDecoratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportFromModule}
	 * labeled alternative in {@link exampleParser#importSTMT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromModule(exampleParser.ImportFromModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportModule}
	 * labeled alternative in {@link exampleParser#importSTMT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportModule(exampleParser.ImportModuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportPath}
	 * labeled alternative in {@link exampleParser#importSTMT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportPath(exampleParser.ImportPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModulePathRule}
	 * labeled alternative in {@link exampleParser#modulePath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulePathRule(exampleParser.ModulePathRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVar}
	 * labeled alternative in {@link exampleParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(exampleParser.AssignVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignIndexed}
	 * labeled alternative in {@link exampleParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignIndexed(exampleParser.AssignIndexedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignCall}
	 * labeled alternative in {@link exampleParser#assignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignCall(exampleParser.AssignCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpGE}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpGE(exampleParser.OpGEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpLE}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpLE(exampleParser.OpLEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpEQ}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpEQ(exampleParser.OpEQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpEQEQ}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpEQEQ(exampleParser.OpEQEQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpNOTEQ}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpNOTEQ(exampleParser.OpNOTEQContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpOR}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpOR(exampleParser.OpORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpAND}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpAND(exampleParser.OpANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(exampleParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(exampleParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BuiltInExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuiltInExpr(exampleParser.BuiltInExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListExprExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExprExpr(exampleParser.ListExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpr(exampleParser.BinaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NoneExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneExpr(exampleParser.NoneExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExprExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExprExpr(exampleParser.CallExprExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModuleExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleExpr(exampleParser.ModuleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallSimple}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSimple(exampleParser.CallSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallCompare}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallCompare(exampleParser.CallCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallPath}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallPath(exampleParser.CallPathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallModuleFunc}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallModuleFunc(exampleParser.CallModuleFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallMethod}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMethod(exampleParser.CallMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallFuncOneArg}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFuncOneArg(exampleParser.CallFuncOneArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallComplex}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallComplex(exampleParser.CallComplexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallChain}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallChain(exampleParser.CallChainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallWithBlock}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallWithBlock(exampleParser.CallWithBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallMap}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallMap(exampleParser.CallMapContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarBuiltIn}
	 * labeled alternative in {@link exampleParser#variableBuiltIn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarBuiltIn(exampleParser.VarBuiltInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IndexSquare}
	 * labeled alternative in {@link exampleParser#indexedAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexSquare(exampleParser.IndexSquareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link exampleParser#listExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(exampleParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link exampleParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(exampleParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorCall}
	 * labeled alternative in {@link exampleParser#functionAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorCall(exampleParser.DecoratorCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorString}
	 * labeled alternative in {@link exampleParser#contentAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorString(exampleParser.DecoratorStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecoratorArgList}
	 * labeled alternative in {@link exampleParser#contentAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorArgList(exampleParser.DecoratorArgListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParamTyped}
	 * labeled alternative in {@link exampleParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamTyped(exampleParser.ParamTypedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnModuleFunc}
	 * labeled alternative in {@link exampleParser#returnSTMT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnModuleFunc(exampleParser.ReturnModuleFuncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStringNumber}
	 * labeled alternative in {@link exampleParser#returnSTMT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStringNumber(exampleParser.ReturnStringNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnVarAttr}
	 * labeled alternative in {@link exampleParser#returnValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnVarAttr(exampleParser.ReturnVarAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStringAssign}
	 * labeled alternative in {@link exampleParser#returnValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStringAssign(exampleParser.ReturnStringAssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnFuncCall}
	 * labeled alternative in {@link exampleParser#returnValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFuncCall(exampleParser.ReturnFuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link exampleParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(exampleParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockIndented}
	 * labeled alternative in {@link exampleParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockIndented(exampleParser.BlockIndentedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlNormal}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlNormal(exampleParser.HtmlNormalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelfClosing}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfClosing(exampleParser.HtmlSelfClosingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlDoctype}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDoctype(exampleParser.HtmlDoctypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(exampleParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlOpenRule}
	 * labeled alternative in {@link exampleParser#htmlOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlOpenRule(exampleParser.HtmlOpenRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlCloseRule}
	 * labeled alternative in {@link exampleParser#htmlClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlCloseRule(exampleParser.HtmlCloseRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlSelfCloseTag}
	 * labeled alternative in {@link exampleParser#htmlSelfClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlSelfCloseTag(exampleParser.HtmlSelfCloseTagContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlDoctypeDecl}
	 * labeled alternative in {@link exampleParser#doctype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDoctypeDecl(exampleParser.HtmlDoctypeDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code HtmlAttribute}
	 * labeled alternative in {@link exampleParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(exampleParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link exampleParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(exampleParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForBlock}
	 * labeled alternative in {@link exampleParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForBlock(exampleParser.JinjaForBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfBlock}
	 * labeled alternative in {@link exampleParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfBlock(exampleParser.JinjaIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExprBlock}
	 * labeled alternative in {@link exampleParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprBlock(exampleParser.JinjaExprBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaForStmtRule}
	 * labeled alternative in {@link exampleParser#jinjaForStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaForStmtRule(exampleParser.JinjaForStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaIfStmtRule}
	 * labeled alternative in {@link exampleParser#jinjaIfStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaIfStmtRule(exampleParser.JinjaIfStmtRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JinjaExprRule}
	 * labeled alternative in {@link exampleParser#jinjaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprRule(exampleParser.JinjaExprRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssBlockRule}
	 * labeled alternative in {@link exampleParser#cssBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBlockRule(exampleParser.CssBlockRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSelectorList}
	 * labeled alternative in {@link exampleParser#selectorRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorList(exampleParser.CssSelectorListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link exampleParser#selectorRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssClassSelector(exampleParser.CssClassSelectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssClassDescendant}
	 * labeled alternative in {@link exampleParser#selectorRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssClassDescendant(exampleParser.CssClassDescendantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSelectorListItems}
	 * labeled alternative in {@link exampleParser#selectorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorListItems(exampleParser.CssSelectorListItemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssSelectorRule}
	 * labeled alternative in {@link exampleParser#cssSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssSelectorRule(exampleParser.CssSelectorRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssDeclaration}
	 * labeled alternative in {@link exampleParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssDeclaration(exampleParser.CssDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CssValueList}
	 * labeled alternative in {@link exampleParser#valueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssValueList(exampleParser.CssValueListContext ctx);
}