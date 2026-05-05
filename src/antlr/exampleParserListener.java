// Generated from C:/Users/Jenan/Desktop/Compiler_project-main/Compiler_project-main/grammars/exampleParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link exampleParser}.
 */
public interface exampleParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link exampleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(exampleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link exampleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(exampleParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void enterPythonStatement(exampleParser.PythonStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonStatement}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void exitPythonStatement(exampleParser.PythonStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonImport}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void enterPythonImport(exampleParser.PythonImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonImport}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void exitPythonImport(exampleParser.PythonImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonComment}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void enterPythonComment(exampleParser.PythonCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonComment}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void exitPythonComment(exampleParser.PythonCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonAssign}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void enterPythonAssign(exampleParser.PythonAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonAssign}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void exitPythonAssign(exampleParser.PythonAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonExpr}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void enterPythonExpr(exampleParser.PythonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonExpr}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void exitPythonExpr(exampleParser.PythonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonList}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void enterPythonList(exampleParser.PythonListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonList}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void exitPythonList(exampleParser.PythonListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonFuncDef}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void enterPythonFuncDef(exampleParser.PythonFuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonFuncDef}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void exitPythonFuncDef(exampleParser.PythonFuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonReturn}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void enterPythonReturn(exampleParser.PythonReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonReturn}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void exitPythonReturn(exampleParser.PythonReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonDecorator}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void enterPythonDecorator(exampleParser.PythonDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonDecorator}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void exitPythonDecorator(exampleParser.PythonDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonIf}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void enterPythonIf(exampleParser.PythonIfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonIf}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void exitPythonIf(exampleParser.PythonIfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PythonNewline}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void enterPythonNewline(exampleParser.PythonNewlineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PythonNewline}
	 * labeled alternative in {@link exampleParser#pythonBlock}.
	 * @param ctx the parse tree
	 */
	void exitPythonNewline(exampleParser.PythonNewlineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtImport}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtImport(exampleParser.StmtImportContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtImport}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtImport(exampleParser.StmtImportContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtAssign(exampleParser.StmtAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtAssign}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtAssign(exampleParser.StmtAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtExpr}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtExpr(exampleParser.StmtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtExpr}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtExpr(exampleParser.StmtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtList}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtList(exampleParser.StmtListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtList}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtList(exampleParser.StmtListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtReturn(exampleParser.StmtReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtReturn}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtReturn(exampleParser.StmtReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StmtDecorator}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStmtDecorator(exampleParser.StmtDecoratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StmtDecorator}
	 * labeled alternative in {@link exampleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStmtDecorator(exampleParser.StmtDecoratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportFromModule}
	 * labeled alternative in {@link exampleParser#importSTMT}.
	 * @param ctx the parse tree
	 */
	void enterImportFromModule(exampleParser.ImportFromModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportFromModule}
	 * labeled alternative in {@link exampleParser#importSTMT}.
	 * @param ctx the parse tree
	 */
	void exitImportFromModule(exampleParser.ImportFromModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportModule}
	 * labeled alternative in {@link exampleParser#importSTMT}.
	 * @param ctx the parse tree
	 */
	void enterImportModule(exampleParser.ImportModuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportModule}
	 * labeled alternative in {@link exampleParser#importSTMT}.
	 * @param ctx the parse tree
	 */
	void exitImportModule(exampleParser.ImportModuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportPath}
	 * labeled alternative in {@link exampleParser#importSTMT}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(exampleParser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportPath}
	 * labeled alternative in {@link exampleParser#importSTMT}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(exampleParser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModulePathRule}
	 * labeled alternative in {@link exampleParser#modulePath}.
	 * @param ctx the parse tree
	 */
	void enterModulePathRule(exampleParser.ModulePathRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModulePathRule}
	 * labeled alternative in {@link exampleParser#modulePath}.
	 * @param ctx the parse tree
	 */
	void exitModulePathRule(exampleParser.ModulePathRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignVar}
	 * labeled alternative in {@link exampleParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignVar(exampleParser.AssignVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignVar}
	 * labeled alternative in {@link exampleParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignVar(exampleParser.AssignVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignIndexed}
	 * labeled alternative in {@link exampleParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignIndexed(exampleParser.AssignIndexedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignIndexed}
	 * labeled alternative in {@link exampleParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignIndexed(exampleParser.AssignIndexedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignCall}
	 * labeled alternative in {@link exampleParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignCall(exampleParser.AssignCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignCall}
	 * labeled alternative in {@link exampleParser#assignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignCall(exampleParser.AssignCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpGE}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterOpGE(exampleParser.OpGEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpGE}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitOpGE(exampleParser.OpGEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpLE}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterOpLE(exampleParser.OpLEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpLE}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitOpLE(exampleParser.OpLEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpEQ}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterOpEQ(exampleParser.OpEQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpEQ}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitOpEQ(exampleParser.OpEQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpEQEQ}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterOpEQEQ(exampleParser.OpEQEQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpEQEQ}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitOpEQEQ(exampleParser.OpEQEQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpNOTEQ}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterOpNOTEQ(exampleParser.OpNOTEQContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpNOTEQ}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitOpNOTEQ(exampleParser.OpNOTEQContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpOR}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterOpOR(exampleParser.OpORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpOR}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitOpOR(exampleParser.OpORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpAND}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterOpAND(exampleParser.OpANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpAND}
	 * labeled alternative in {@link exampleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitOpAND(exampleParser.OpANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void enterStringExpr(exampleParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void exitStringExpr(exampleParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(exampleParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(exampleParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BuiltInExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void enterBuiltInExpr(exampleParser.BuiltInExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BuiltInExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void exitBuiltInExpr(exampleParser.BuiltInExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListExprExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void enterListExprExpr(exampleParser.ListExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListExprExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void exitListExprExpr(exampleParser.ListExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void enterBinaryExpr(exampleParser.BinaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void exitBinaryExpr(exampleParser.BinaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NoneExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void enterNoneExpr(exampleParser.NoneExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NoneExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void exitNoneExpr(exampleParser.NoneExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallExprExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void enterCallExprExpr(exampleParser.CallExprExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallExprExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void exitCallExprExpr(exampleParser.CallExprExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModuleExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void enterModuleExpr(exampleParser.ModuleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModuleExpr}
	 * labeled alternative in .
	 * @param ctx the parse tree
	 */
	void exitModuleExpr(exampleParser.ModuleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallSimple}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallSimple(exampleParser.CallSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallSimple}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallSimple(exampleParser.CallSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallCompare}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallCompare(exampleParser.CallCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallCompare}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallCompare(exampleParser.CallCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallPath}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallPath(exampleParser.CallPathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallPath}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallPath(exampleParser.CallPathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallModuleFunc}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallModuleFunc(exampleParser.CallModuleFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallModuleFunc}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallModuleFunc(exampleParser.CallModuleFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallMethod}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallMethod(exampleParser.CallMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallMethod}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallMethod(exampleParser.CallMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallFuncOneArg}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallFuncOneArg(exampleParser.CallFuncOneArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallFuncOneArg}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallFuncOneArg(exampleParser.CallFuncOneArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallComplex}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallComplex(exampleParser.CallComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallComplex}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallComplex(exampleParser.CallComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallChain}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallChain(exampleParser.CallChainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallChain}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallChain(exampleParser.CallChainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallWithBlock}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallWithBlock(exampleParser.CallWithBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallWithBlock}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallWithBlock(exampleParser.CallWithBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CallMap}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallMap(exampleParser.CallMapContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CallMap}
	 * labeled alternative in {@link exampleParser#callExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallMap(exampleParser.CallMapContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarBuiltIn}
	 * labeled alternative in {@link exampleParser#variableBuiltIn}.
	 * @param ctx the parse tree
	 */
	void enterVarBuiltIn(exampleParser.VarBuiltInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarBuiltIn}
	 * labeled alternative in {@link exampleParser#variableBuiltIn}.
	 * @param ctx the parse tree
	 */
	void exitVarBuiltIn(exampleParser.VarBuiltInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IndexSquare}
	 * labeled alternative in {@link exampleParser#indexedAccess}.
	 * @param ctx the parse tree
	 */
	void enterIndexSquare(exampleParser.IndexSquareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IndexSquare}
	 * labeled alternative in {@link exampleParser#indexedAccess}.
	 * @param ctx the parse tree
	 */
	void exitIndexSquare(exampleParser.IndexSquareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link exampleParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(exampleParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListLiteral}
	 * labeled alternative in {@link exampleParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(exampleParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link exampleParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(exampleParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link exampleParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(exampleParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorCall}
	 * labeled alternative in {@link exampleParser#functionAt}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorCall(exampleParser.DecoratorCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorCall}
	 * labeled alternative in {@link exampleParser#functionAt}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorCall(exampleParser.DecoratorCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorString}
	 * labeled alternative in {@link exampleParser#contentAt}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorString(exampleParser.DecoratorStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorString}
	 * labeled alternative in {@link exampleParser#contentAt}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorString(exampleParser.DecoratorStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecoratorArgList}
	 * labeled alternative in {@link exampleParser#contentAt}.
	 * @param ctx the parse tree
	 */
	void enterDecoratorArgList(exampleParser.DecoratorArgListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecoratorArgList}
	 * labeled alternative in {@link exampleParser#contentAt}.
	 * @param ctx the parse tree
	 */
	void exitDecoratorArgList(exampleParser.DecoratorArgListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParamTyped}
	 * labeled alternative in {@link exampleParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamTyped(exampleParser.ParamTypedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParamTyped}
	 * labeled alternative in {@link exampleParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamTyped(exampleParser.ParamTypedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnModuleFunc}
	 * labeled alternative in {@link exampleParser#returnSTMT}.
	 * @param ctx the parse tree
	 */
	void enterReturnModuleFunc(exampleParser.ReturnModuleFuncContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnModuleFunc}
	 * labeled alternative in {@link exampleParser#returnSTMT}.
	 * @param ctx the parse tree
	 */
	void exitReturnModuleFunc(exampleParser.ReturnModuleFuncContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStringNumber}
	 * labeled alternative in {@link exampleParser#returnSTMT}.
	 * @param ctx the parse tree
	 */
	void enterReturnStringNumber(exampleParser.ReturnStringNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStringNumber}
	 * labeled alternative in {@link exampleParser#returnSTMT}.
	 * @param ctx the parse tree
	 */
	void exitReturnStringNumber(exampleParser.ReturnStringNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnVarAttr}
	 * labeled alternative in {@link exampleParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void enterReturnVarAttr(exampleParser.ReturnVarAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnVarAttr}
	 * labeled alternative in {@link exampleParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void exitReturnVarAttr(exampleParser.ReturnVarAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStringAssign}
	 * labeled alternative in {@link exampleParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void enterReturnStringAssign(exampleParser.ReturnStringAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStringAssign}
	 * labeled alternative in {@link exampleParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void exitReturnStringAssign(exampleParser.ReturnStringAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnFuncCall}
	 * labeled alternative in {@link exampleParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void enterReturnFuncCall(exampleParser.ReturnFuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnFuncCall}
	 * labeled alternative in {@link exampleParser#returnValue}.
	 * @param ctx the parse tree
	 */
	void exitReturnFuncCall(exampleParser.ReturnFuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link exampleParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(exampleParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link exampleParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(exampleParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockIndented}
	 * labeled alternative in {@link exampleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockIndented(exampleParser.BlockIndentedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockIndented}
	 * labeled alternative in {@link exampleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockIndented(exampleParser.BlockIndentedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlNormal}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 */
	void enterHtmlNormal(exampleParser.HtmlNormalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlNormal}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 */
	void exitHtmlNormal(exampleParser.HtmlNormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSelfClosing}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelfClosing(exampleParser.HtmlSelfClosingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSelfClosing}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelfClosing(exampleParser.HtmlSelfClosingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlDoctype}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDoctype(exampleParser.HtmlDoctypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlDoctype}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDoctype(exampleParser.HtmlDoctypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(exampleParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlComment}
	 * labeled alternative in {@link exampleParser#htmlBlock}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(exampleParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlOpenRule}
	 * labeled alternative in {@link exampleParser#htmlOpen}.
	 * @param ctx the parse tree
	 */
	void enterHtmlOpenRule(exampleParser.HtmlOpenRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlOpenRule}
	 * labeled alternative in {@link exampleParser#htmlOpen}.
	 * @param ctx the parse tree
	 */
	void exitHtmlOpenRule(exampleParser.HtmlOpenRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlCloseRule}
	 * labeled alternative in {@link exampleParser#htmlClose}.
	 * @param ctx the parse tree
	 */
	void enterHtmlCloseRule(exampleParser.HtmlCloseRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlCloseRule}
	 * labeled alternative in {@link exampleParser#htmlClose}.
	 * @param ctx the parse tree
	 */
	void exitHtmlCloseRule(exampleParser.HtmlCloseRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlSelfCloseTag}
	 * labeled alternative in {@link exampleParser#htmlSelfClose}.
	 * @param ctx the parse tree
	 */
	void enterHtmlSelfCloseTag(exampleParser.HtmlSelfCloseTagContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlSelfCloseTag}
	 * labeled alternative in {@link exampleParser#htmlSelfClose}.
	 * @param ctx the parse tree
	 */
	void exitHtmlSelfCloseTag(exampleParser.HtmlSelfCloseTagContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlDoctypeDecl}
	 * labeled alternative in {@link exampleParser#doctype}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDoctypeDecl(exampleParser.HtmlDoctypeDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlDoctypeDecl}
	 * labeled alternative in {@link exampleParser#doctype}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDoctypeDecl(exampleParser.HtmlDoctypeDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code HtmlAttribute}
	 * labeled alternative in {@link exampleParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(exampleParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code HtmlAttribute}
	 * labeled alternative in {@link exampleParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(exampleParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link exampleParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(exampleParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link exampleParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(exampleParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForBlock}
	 * labeled alternative in {@link exampleParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForBlock(exampleParser.JinjaForBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForBlock}
	 * labeled alternative in {@link exampleParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForBlock(exampleParser.JinjaForBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfBlock}
	 * labeled alternative in {@link exampleParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfBlock(exampleParser.JinjaIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfBlock}
	 * labeled alternative in {@link exampleParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfBlock(exampleParser.JinjaIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExprBlock}
	 * labeled alternative in {@link exampleParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExprBlock(exampleParser.JinjaExprBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExprBlock}
	 * labeled alternative in {@link exampleParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExprBlock(exampleParser.JinjaExprBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaForStmtRule}
	 * labeled alternative in {@link exampleParser#jinjaForStmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaForStmtRule(exampleParser.JinjaForStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaForStmtRule}
	 * labeled alternative in {@link exampleParser#jinjaForStmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaForStmtRule(exampleParser.JinjaForStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaIfStmtRule}
	 * labeled alternative in {@link exampleParser#jinjaIfStmt}.
	 * @param ctx the parse tree
	 */
	void enterJinjaIfStmtRule(exampleParser.JinjaIfStmtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaIfStmtRule}
	 * labeled alternative in {@link exampleParser#jinjaIfStmt}.
	 * @param ctx the parse tree
	 */
	void exitJinjaIfStmtRule(exampleParser.JinjaIfStmtRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JinjaExprRule}
	 * labeled alternative in {@link exampleParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExprRule(exampleParser.JinjaExprRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JinjaExprRule}
	 * labeled alternative in {@link exampleParser#jinjaExpr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExprRule(exampleParser.JinjaExprRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssBlockRule}
	 * labeled alternative in {@link exampleParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void enterCssBlockRule(exampleParser.CssBlockRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssBlockRule}
	 * labeled alternative in {@link exampleParser#cssBlock}.
	 * @param ctx the parse tree
	 */
	void exitCssBlockRule(exampleParser.CssBlockRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSelectorList}
	 * labeled alternative in {@link exampleParser#selectorRule}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorList(exampleParser.CssSelectorListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSelectorList}
	 * labeled alternative in {@link exampleParser#selectorRule}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorList(exampleParser.CssSelectorListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link exampleParser#selectorRule}.
	 * @param ctx the parse tree
	 */
	void enterCssClassSelector(exampleParser.CssClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssClassSelector}
	 * labeled alternative in {@link exampleParser#selectorRule}.
	 * @param ctx the parse tree
	 */
	void exitCssClassSelector(exampleParser.CssClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssClassDescendant}
	 * labeled alternative in {@link exampleParser#selectorRule}.
	 * @param ctx the parse tree
	 */
	void enterCssClassDescendant(exampleParser.CssClassDescendantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssClassDescendant}
	 * labeled alternative in {@link exampleParser#selectorRule}.
	 * @param ctx the parse tree
	 */
	void exitCssClassDescendant(exampleParser.CssClassDescendantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSelectorListItems}
	 * labeled alternative in {@link exampleParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorListItems(exampleParser.CssSelectorListItemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSelectorListItems}
	 * labeled alternative in {@link exampleParser#selectorList}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorListItems(exampleParser.CssSelectorListItemsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssSelectorRule}
	 * labeled alternative in {@link exampleParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void enterCssSelectorRule(exampleParser.CssSelectorRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssSelectorRule}
	 * labeled alternative in {@link exampleParser#cssSelector}.
	 * @param ctx the parse tree
	 */
	void exitCssSelectorRule(exampleParser.CssSelectorRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssDeclaration}
	 * labeled alternative in {@link exampleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterCssDeclaration(exampleParser.CssDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssDeclaration}
	 * labeled alternative in {@link exampleParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitCssDeclaration(exampleParser.CssDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CssValueList}
	 * labeled alternative in {@link exampleParser#valueList}.
	 * @param ctx the parse tree
	 */
	void enterCssValueList(exampleParser.CssValueListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CssValueList}
	 * labeled alternative in {@link exampleParser#valueList}.
	 * @param ctx the parse tree
	 */
	void exitCssValueList(exampleParser.CssValueListContext ctx);
}