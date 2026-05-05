parser grammar exampleParser;
options { tokenVocab=exampleLexer; }


program
    : (htmlBlock
      | jinjaBlock
      | cssBlock
      | pythonBlock
      | WORD
      | NEWLINE    // إضافة السطر الجديد لتجنب أخطاء الأسطر الفارغة في النهاية
      | INDENT     // إضافة الإزاحة لتجنب أخطاء تنظيم الـ Lexer في النهاية
      | DEDENT     // إضافة الإلغاء لتجنب أخطاء تنظيم الـ Lexer في النهاية
      )+ EOF
    ;

/* ================= PYTHON ================= */

pythonBlock
    : statement                                                              #PythonStatement
    | importSTMT                                                             #PythonImport
    | PYTHON_COMMENT                                                         #PythonComment
    | assignmentStmt                                                         #PythonAssign
    | expr                                                                   #PythonExpr
    | listExpr                                                               #PythonList
    | functionDef                                                            #PythonFuncDef
    | returnSTMT                                                             #PythonReturn
    | functionAt                                                             #PythonDecorator
    | ifStmt                                                                 #PythonIf
    | NEWLINE                                                                #PythonNewline
    ;

statement
    : importSTMT (NEWLINE)?                                                  #StmtImport
    | assignmentStmt (NEWLINE)?                                              #StmtAssign
    | expr (NEWLINE)?                                                        #StmtExpr
    | listExpr (NEWLINE)?                                                    #StmtList
    | returnSTMT (NEWLINE)?                                                  #StmtReturn
    | functionAt (NEWLINE)?                                                  #StmtDecorator
    ;

importSTMT
    : FROM ID IMPORT ID (COMMA ID)*                                          #ImportFromModule
    | IMPORT ID (COMMA ID)?                                                  #ImportModule
    | FROM modulePath IMPORT (ID)?                                           #ImportPath
    ;

modulePath
    : ID (DOT ID)*                                                           #ModulePathRule
    ;

assignmentStmt
    : ID EQ expr                                                             #AssignVar
    | indexedAccess EQ expr                                                  #AssignIndexed
    | modulePath LPAREN ID COMMA ID EQ (TRUE | FALSE) RPAREN                 #AssignCall
    ;

simpleExpr
    : GE                                                                     #OpGE
    | LE                                                                     #OpLE
    | EQ                                                                     #OpEQ
    | EQEQ                                                                   #OpEQEQ
    | NOTEQ                                                                  #OpNOTEQ
    | OR                                                                     #OpOR
    | AND                                                                    #OpAND
    ;

expr
    : left=expr simpleExpr right=expr                                        #BinaryExpr
    | callExpr                                                               #CallExprExpr
    | listExpr                                                               #ListExprExpr
    | variableBuiltIn                                                        #BuiltInExpr
    | STRING                                                                 #StringExpr
    | ID                                                                     #ModuleExpr
    | (TRUE | FALSE)                                                         #BoolExpr
    | NONE                                                                   #NoneExpr
    ;

callExpr
    : ID LPAREN (expr (COMMA expr)* (DOT ID)?)? RPAREN                       #CallSimple
    | modulePath simpleExpr STRING                                           #CallCompare
    | modulePath LPAREN (expr (COMMA expr)*(DOT ID listExpr COMMA ID)?)? RPAREN
                                                                             #CallPath
    | modulePath LPAREN (STRING | ID COMMA assignmentStmt) RPAREN            #CallModuleFunc
    | modulePath LPAREN (ID (simpleExpr (TRUE | FALSE))?)? RPAREN            #CallMethod
    | ID LPAREN ID RPAREN                                                    #CallFuncOneArg
    | INT simpleExpr ID simpleExpr ID simpleExpr ID LPAREN ID RPAREN         #CallComplex
    | ID simpleExpr ID (DOT ID)+ LPAREN RPAREN simpleExpr STRING             #CallChain
    | modulePath LPAREN LBRACE block RBRACE RPAREN                           #CallWithBlock
    | STRING COLON ID (COMMA)?                                               #CallMap
    ;

variableBuiltIn
    : DOUBLEUNDERSCORE ID DOUBLEUNDERSCORE (simpleExpr STRING)*              #VarBuiltIn
    ;

indexedAccess
    : modulePath LBRACK (STRING | ID)? RBRACK                                #IndexSquare
    ;

listExpr
    : LBRACK (expr (COMMA expr)*)?(STRING)? RBRACK                            #ListLiteral
    ;

functionDef
    : DEF ID LPAREN (paramList)? RPAREN COLON block                           #FuncDef
    ;

functionAt
    : AT modulePath LPAREN (contentAt)* RPAREN                                #DecoratorCall
    ;

contentAt
    : STRING                                                                  #DecoratorString
    | (COMMA)? ID EQ LBRACK STRING (COMMA STRING)? RBRACK                     #DecoratorArgList
    ;

paramList
    : modulePath ((COLON ID) | (COMMA ID EQ NONE)?)                          #ParamTyped
    ;

returnSTMT
    : RETURN modulePath LPAREN (returnValue | STRING) RPAREN                 #ReturnModuleFunc
    | RETURN STRING COMMA INT                                                #ReturnStringNumber
    ;

returnValue
    : ID (COMMA ID)* (DOT ID)*                                                #ReturnVarAttr
    | STRING COMMA assignmentStmt                                             #ReturnStringAssign
    | ID LPAREN STRING RPAREN                                                 #ReturnFuncCall
    ;

ifStmt
    : IF expr COLON thenBlock=block (ELSE COLON elseBlock=block)?             #IfStatement
    ;

block
    : NEWLINE INDENT (statement | ifStmt)+ (NEWLINE)? DEDENT                  #BlockIndented
    ;

/* ================= HTML ================= */

htmlBlock
    : htmlOpen htmlContent htmlClose                                          #HtmlNormal
    | htmlSelfClose                                                           #HtmlSelfClosing
    | doctype                                                                 #HtmlDoctype
    | HTML_COMMENT                                                            #HtmlComment
    ;

htmlOpen
    : OPEN_HTML HTML_TAG_NAME attribute* CLOSE_HTML                           #HtmlOpenRule
    ;

htmlClose
    : OPEN_HTML SLASH HTML_TAG_NAME CLOSE_HTML                                #HtmlCloseRule
    ;

htmlSelfClose
    : OPEN_HTML HTML_TAG_NAME_SELF_CLOSE attribute* SLASH? CLOSE_HTML         #HtmlSelfCloseTag
    ;

doctype
    : OPEN_HTML DOCTYPE HTML_TAG_NAME CLOSE_HTML                              #HtmlDoctypeDecl
    ;

attribute
    : ATTRIBUTE_NAME (EQ_HTML ATTRIBUTE_VALUE)?                               #HtmlAttribute
    ;

// إرجاع القاعدة إلى الشكل المبسط (بدون قاعدة وسيطة)
htmlContent
    : (htmlBlock
      | jinjaForStmt
      | jinjaIfStmt
      | jinjaExpr
      | cssBlock
      | NEWLINE
      | INDENT    // إضافة هذا السطر للسماح بوجود الإزاحة
      | DEDENT    // إضافة هذا السطر للسماح بخروج الإزاحة
      | WORD
      | ARABIC_QUESTION_MARK
      | ARABIC_COMMA
      | COLON
      )*
    ;

/* ================= JINJA ================= */


jinjaBlock
    : jinjaForStmt    #JinjaForBlock
    | jinjaIfStmt     #JinjaIfBlock
    | jinjaExpr       #JinjaExprBlock
    ;

jinjaForStmt
    : JINJA_OPEN_STMT JINJA_FOR JINJA_NAME JINJA_IN JINJA_NAME JINJA_CLOSE_STMT
      htmlContent
      JINJA_OPEN_STMT JINJA_ENDFOR JINJA_CLOSE_STMT                           #JinjaForStmtRule
    ;

jinjaIfStmt
    : JINJA_OPEN_STMT JINJA_IF JINJA_NAME JINJA_CLOSE_STMT
      htmlContent
      JINJA_OPEN_STMT JINJA_ENDIF JINJA_CLOSE_STMT                            #JinjaIfStmtRule
    ;

jinjaExpr
    : JINJA_OPEN JINJA_NAME JINJA_CLOSE                                       #JinjaExprRule
    ;

/* ================= CSS ================= */

cssBlock
    : CSS_OPEN (selectorRule | CSS_COMMENT)* CSS_CLOSE                        #CssBlockRule
    ;

selectorRule
    : selectorList LBRACE_CSS declaration* RBRACE_CSS                          #CssSelectorList
    | CLASS_SELECTOR (cssSelector)? LBRACE_CSS declaration* RBRACE_CSS         #CssClassSelector
    | CLASS_SELECTOR SELECTOR LBRACE_CSS declaration* RBRACE_CSS               #CssClassDescendant
    ;

selectorList
    : cssSelector (COMMA_CSS? cssSelector)*                                   #CssSelectorListItems
    ;

cssSelector
    : SELECTOR (COLON_CSS PSEUDO_CLASS)?                                      #CssSelectorRule
    ;

declaration
    : PROPERTY_NAME COLON_CSS (PROPERTY_VALUE | COMMA_CSS)* SEMI_CSS?         #CssDeclaration
    ;

valueList
    : PROPERTY_VALUE (COMMA_CSS PROPERTY_VALUE)*                              #CssValueList
    ;