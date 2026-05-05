lexer grammar exampleLexer;
tokens { INDENT, DEDENT }

@members {
    java.util.Stack<Integer> indents = new java.util.Stack<>();
    int opened = 0;
    java.util.LinkedList<Token> tokens = new java.util.LinkedList<>();

    // التعديل النهائي: استخدام 0 بدلاً من DEFAULT_CHANNEL
    // هذا يمنع خطأ "cannot find symbol"
    Token commonToken(int type, String text) {
        // 1. إنشاء الـ Pair المصحح
        org.antlr.v4.runtime.misc.Pair<org.antlr.v4.runtime.TokenSource, org.antlr.v4.runtime.CharStream> source =
            new org.antlr.v4.runtime.misc.Pair<>(this, this.getInputStream());

        // 2. إنشاء التوكن. استخدمنا 0 كرمز للقناة الافتراضية (DEFAULT_CHANNEL)
        // البناء: (المصدر، النوع، القناة، البداية، النهاية)
        CommonToken t = new CommonToken(source, type, 0, -1, -1);

        // 3. ضبط النص ومعلومات السطر
        t.setText(text);
        t.setLine(getLine());
        t.setCharPositionInLine(getCharPositionInLine());

        return t;
    }

    void openBrace() { opened++; }
    void closeBrace() { if (opened > 0) opened--; }

    @Override
    public Token nextToken() {
        // 1. إرجاع التوكنات المخزنة أولاً
        if (!tokens.isEmpty()) {
            return tokens.poll();
        }

        // 2. جلب التوكن التالي
        Token next = super.nextToken();

        if (_mode == Lexer.DEFAULT_MODE) {
            // 3. معالجة الأسطر الجديدة للمسافات البادئة (INDENT/DEDENT)
            if (next.getType() == NEWLINE) {
                // استخراج المسافات
                String spacesText = next.getText().
                replaceAll("[\r\n\f]+", "");
                int indent = 0;
                for (char c : spacesText.toCharArray()) {
                    indent += (c == '\t') ? 4 : 1;
                }

                // تهيئة المكدس
                if (indents.isEmpty()) {
                    indents.push(0);
                }

                int prevIndent = indents.peek();
                tokens.add(next); // إضافة NEWLINE دائماً

                if (opened == 0) {
                    if (indent > prevIndent) {
                        // حالة الإزاحة (INDENT)
                        indents.push(indent);
                        tokens.add(commonToken(INDENT, spacesText));
                    } else if (indent < prevIndent) {
                        // حالة الخروج من الإزاحة (DEDENT)
                        while (!indents.isEmpty() && indents.peek() > indent) {
                            indents.pop();
                            tokens.add(commonToken(DEDENT, ""));
                            if (indents.isEmpty()) break;
                        }
                    }
                }
                return tokens.poll();
            }

            // 4. معالجة نهاية الملف (EOF)
            if (next.getType() == EOF) {
                while (!indents.isEmpty()) {
                    indents.pop();
                    tokens.add(commonToken(DEDENT, ""));
                }
                tokens.add(next);
                return tokens.poll();
            }
        }
        return next;
    }
}


CSS_OPEN         : '<style>' -> pushMode(CSS);
OPEN_HTML        : '<' -> pushMode(HTML);
JINJA_OPEN_STMT  : '{%' -> pushMode(JINJA)   ;
JINJA_OPEN       : '{{' -> pushMode(JINJA)   ;
ARABIC_LETTER
    : [\u0621-\u064A]
    ;
ARABIC_QUESTION_MARK
    : '\u061F'
    ;
ARABIC_COMMA
    : '\u060C'
    ;
WORD
    : (ARABIC_LETTER)+
    ;
/* ================= NEWLINE ================= */
NEWLINE : ('\r'? '\n' | '\r' | '\f') [ \t]* ;
/* ================= Default Mode 'PYTHON' ================= */
//keywords
IMPORT   : 'import';
AS       : 'as';
CLASS    : 'class';
GLOBAL   : 'global';
NONLOCAL : 'nonlocal';
PASS     : 'pass';
RAISE    : 'raise';
TRY      : 'try';
EXCEPT   : 'except';
FINALLY  : 'finally';
WITH     : 'with';
FROM     : 'from'  ;
LAMBDA   : 'lambda';
DEF      : 'def'   ;
DEL      : 'del';
NONE     : 'None'  ;
RETURN   : 'return';
YIELD    : 'yield';
ASSERT   : 'assert';
IF       : 'if'    ;
ELIF     : 'elif';
ELSE     : 'else'  ;
WHILE    : 'while';
FOR      : 'for';
IN       : 'in';
BREAK    : 'break';
CONTINUE : 'continue';
TRUE     : 'True';
FALSE    : 'False';

LPAREN : '(' { openBrace(); } ;
RPAREN : ')' { closeBrace(); } ;
LBRACK : '[' { openBrace(); } ;
RBRACK : ']' { closeBrace(); } ;
LBRACE : '{' { openBrace(); } ;
RBRACE : '}' { closeBrace(); } ;


DOUBLEUNDERSCORE : '__' ;

//data type
//TRIPLE_STRING
//    : '\'\'\'' (.|[\r\n])*? '\'\'\''
//    | '"""' (.|[\r\n])*? '"""'
//    ;
STRING
//    : '"' (~["\\\r\n] | ESC)* '"'
//    | '\'' (~['\\\r\n] | ESC)* '\''
    :'"' (~["\r\n])* '"' | '\'' (~['\r\n])* '\''
    ;
//fragment ESC
//    : '\\' [btnfr"'\\]
//    | '\\' 'x' HEX HEX
//    | '\\' 'u' HEX HEX HEX HEX
//    ;
//
//fragment HEX : [0-9a-fA-F];

INT
    : '0'
    | [1-9] [0-9]*
    ;
FLOAT
    : [0-9]+ '.' [0-9]*
    | '.' [0-9]+
    ;

//operators
NOTEQ            : '!=';
EQEQ             : '==';
EQ               : '=' ;
GE               : '>=' ;
LE               : '<=' ;
OR               : 'or';
AND              : 'and';
NOT              : 'not';
IS               : 'is';
POW              : '**';
MOD              : '%';
PLUS             : '+';
MINUS            : '-';
MULT             : '*';
DIV              : '/';

//punctuators
COMMA            : ',' ;
DOT              : '.' ;
COLON            : ':' ;
AT               : '@' ;


// identifiers
ID
    : [a-zA-Z_] [a-zA-Z_0-9]* ;


//comments and whitespace
PYTHON_COMMENT
    : '#' ~[\r\n]* ->skip
    ;
WS
    : [ \t\r\n]+ -> skip //[ \t]+ -> skip
    ;

/* ================= HTML Mode ================= */
mode HTML;
CLOSE_HTML       : '>'-> popMode;
//keywords
DOCTYPE          : '!DOCTYPE'   ;
//operators
EQ_HTML          : '='          ;
//punctuators
SLASH            : '/'          ;

//constant
HTML_TAG_NAME
    : 'html'
    | 'head'
    | 'title'
    | 'body'
    | 'h1'
    | 'h2'
    | 'h3'
    | 'a'
    | 'button'
    | 'div'
    | 'p'
    | 'strong'
    | 'form'
    | 'label'
    | 'textarea'
    | 'ul'
    | 'li'
    | 'footer'
    ;
HTML_TAG_NAME_SELF_CLOSE
    : 'img'
    | 'meta'
    | 'link'
    | 'br'
    | 'input'
    ;
// identifiers
ATTRIBUTE_NAME
    : [a-zA-Z_:][a-zA-Z0-9_:.-]*
    ;
ATTRIBUTE_VALUE
    : '"' (~["\r\n])* '"'
    | '\'' (~['\r\n])* '\''
    ;

//comments and whitespace
HTML_COMMENT
    : '<!--' .*? '-->' -> skip
    ;
WS_HTML
    : [ \t\r\n\u000C]+ -> skip
    ;
/* ================= JINJA Mode ================= */
mode JINJA;
JINJA_CLOSE_STMT : '%}' -> popMode;
JINJA_CLOSE      : '}}' -> popMode;
//keywords
JINJA_FOR        : 'for';
JINJA_ENDFOR     : 'endfor';
JINJA_IN         : 'in';
JINJA_IF         : 'if';
JINJA_ENDIF      : 'endif';
JINJA_NAME
    : [a-zA-Z_][a-zA-Z0-9_]*( '.' [a-zA-Z_][a-zA-Z0-9_]*)*
    ;
//whitespaces
JINJA_WS
    : [ \t\r\n]+ -> skip
    ;
/* ================= CSS Mode ================= */
mode CSS;
CSS_CLOSE
    : '</style>' -> popMode
    ;
//punctuators
LBRACE_CSS           : '{' ;
RBRACE_CSS           : '}' ;
COMMA_CSS            : ',' ;
COLON_CSS            : ':' ;
SEMI_CSS             : ';' ;
//constants
SELECTOR
    : 'body'
    | 'h1'
    | 'h3'
    | 'a'
    | 'button'
    | 'img'
    | 'form'
    | 'label'
    | 'input'
    | 'textarea'

    ;
PROPERTY_NAME
    : 'font-family'
    | 'background-color'
    | 'margin'
    | 'color'
    | 'text-decoration'
    | 'border'
    | 'padding'
    | 'cursor'
    | 'border-radius'
    | 'width'
    | 'box-shadow'
    | 'text-align'
    | 'margin-bottom'
    | 'max-width'
    | 'display'
    | 'margin-top'
    | 'font-weight'
    ;
PSEUDO_CLASS
    : 'hover'
    ;
//identifiers
CLASS_SELECTOR
    : '.'[a-zA-Z_][a-zA-Z0-9_-]*
    ;
PROPERTY_VALUE
    : [a-zA-Z0-9.#%()_-]+
    ;
//comments and whitespaces

CSS_WS
    : [ \t\u000C\r\n]+ -> skip
    ;
CSS_COMMENT
    : '/*' .*? '*/' ->skip
    ;

UNKNOWN
    : . -> skip
;