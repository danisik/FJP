grammar SimpleJava;

/* -------------- lexical rules -------------- */

/* ------ Keywords ------ */
/* types */
BOOLEAN : 'boolean' ;
INT   : 'int' ;

/* condition */
IF    : 'if' ;
ELSE  : 'else' ;
SWITCH  : 'switch' ;
CASE  : 'case' ;
DEFAULT : 'default' ;

/* loops */
FOR   : 'for' ;
WHILE : 'while' ;
DO    : 'do' ;
REPEAT  : 'repeat' ;
UNTIL : 'until' ;

VOID  : 'void' ;
RETURN : 'return' ;
CONST : 'const' ;
FUNCTION_KEYWORD : 'function' ;

/* ------ Operators ------ */
TRUE  : 'true' ;
FALSE : 'false' ;
MULT  : '*' ;
DIV   : '/' ;
PLUS  : '+' ;
MINUS : '-' ;
GT    : '>' ;
GE    : '>=' ;
LT    : '<' ;
LE    : '<=' ;
SAME  : '==' ;
EQ    : '=' ;
AND   : '&&' ;
OR    : '||' ;
QUESTION : '?' ;
COLON : ':' ;
NOT_EQ : '!=' ;


/* ------ Separators ------ */
LPAREN:             '(';
RPAREN:             ')';
LBRACE:             '{';
RBRACE:             '}';
LBRACK:             '[';
RBRACK:             ']';
SEMI:               ';';
COMMA:              ',';



/* ------ Literals ------ */

fragment DIGIT : [0-9]+ ;

fragment LOWECASE : [a-z] ;

fragment UPPERCASE : [A-Z] ;

WORD  : (LOWECASE | UPPERCASE | '_')+ ;

DECIMAL : DIGIT;

BOOL_LITERAL : TRUE
             | FALSE
             ;

WHITESPACE : [ \r\t\n]+ -> skip ;

fragment DATA_TYPES : BOOLEAN | INT ;

fragment METHOD_RETURN_TYPE : DATA_TYPES | VOID ;

fragment POSSIBLE_VALUES : DECIMAL | BOOL_LITERAL ;


/* -------------- parser rules -------------- */

identifier
  : WORD (WORD | DECIMAL)*
  ;

decimalVariable
  : INT identifier (paralelDeclaration)* EQ DECIMAL
  ;

boolVariable
  : BOOLEAN identifier (paralelDeclaration)* EQ BOOL_LITERAL
  ;

localVariableDeclaration
  : (decimalVariable | boolVariable) SEMI
  ;

constDeclaration
  : CONST localVariableDeclaration SEMI
  ;

variableDeclaration
  : (localVariableDeclaration | constDeclaration)+
  ;

paralelDeclaration
  : EQ identifier
  ;


setVariable
  : identifier EQ POSSIBLE_VALUES
  ;

block
  : LBRACE blockStatement* RBRACE
  ;


blockStatement
  : variableDeclaration
  | statement
  | methodCall
  | methodDeclaration
  | setVariable
  ;

statement
  : IF expression block (ELSE block)?
  | FOR LPAREN forControl RPAREN block
  | WHILE expression block
  | DO block WHILE expression SEMI
  | SWITCH expression LBRACE switchBlockStatement* RBRACE
  | RETURN expression? SEMI
  | SEMI
  ;

expression
  : LPAREN expressionBody RPAREN
  ;

expressionBody
  : POSSIBLE_VALUES
  | identifier
  | expressionBody op=(MULT | DIV | PLUS | MINUS | GT | GE | LT | LE | SAME | AND | OR | NOT_EQ) expressionBody
  ;

forControl
  : DIGIT '...' DIGIT
  ;

switchBlockStatement
  : CASE DIGIT COLON block
  | DEFAULT COLON block
  ;

methodDeclaration
  : METHOD_RETURN_TYPE identifier LPAREN methodParameter? RPAREN methodBody
  ;

methodParameter
  : DATA_TYPES identifier
  | DATA_TYPES identifier COMMA methodParameter
  ;

methodBody
  : block
  ;

methodCall
  : identifier LPAREN methodParameter? RPAREN SEMI
  ;
