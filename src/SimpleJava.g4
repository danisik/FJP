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
MOD   : '%' ;
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
NEGATION : '!';


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

WHITESPACE : [ \r\t\n]+ -> skip ;


/* -------------- parser rules -------------- */
methodReturnType
  : INT
  | BOOLEAN
  | VOID
  ;

possibleValues
  : DECIMAL
  | TRUE
  | FALSE
  ;

identifier
  : WORD (WORD | DECIMAL)*
  ;

decimalVariable
  : INT identifier (paralelDeclaration)* EQ operator? decimalValue
  ;

operator
  : PLUS
  | MINUS
  ;

decimalValue
  : DECIMAL
  | methodCall
  | identifier
  ;

boolVariable
  : BOOLEAN identifier (paralelDeclaration)* EQ boolValue
  ;

boolValue
  : TRUE
  | FALSE
  | methodCall
  | identifier
  | expression
  ;

localVariableDeclaration
  : (decimalVariable | boolVariable) SEMI
  ;

constVariableDeclaration
  : CONST localVariableDeclaration
  ;

variableDeclaration
  : (localVariableDeclaration | constVariableDeclaration)
  ;

paralelDeclaration
  : EQ identifier
  ;


variableAssigment
  : identifier EQ (possibleValues | expression | methodCall) SEMI
  ;

program
  : block
  ;

block
  : LBRACE blockStatement? RBRACE
  ;

body
  : LBRACE blockBody? RBRACE
  ;

blockStatement
  : (variableDeclaration
  | statement
  | methodDeclaration)+
  ;

blockBody
  : (variableDeclaration
  | statement)+
  ;

statement
  : IF expression body (ELSE body)?                        #statementIf
  | FOR forControl body                                    #statementFor
  | WHILE expression body                                  #statementWhile
  | DO body WHILE expression                               #statementDo
  | SWITCH expression LBRACE switchBlockStatement* RBRACE  #statementSwitch
  | REPEAT body UNTIL expression                           #statementRepeat
  | methodCall SEMI                                        #statementMethodCall
  | variableAssigment                                      #statementAssigment
  ;

expression
  : LPAREN expressionBody RPAREN
  ;

expressionBody
  : possibleValues                                                          #exprPossibleValue
  | identifier                                                              #exprIdentifier
  | expressionBody op=(MULT | DIV | MOD) expressionBody                     #exprMultipli
  | expressionBody op=(PLUS | MINUS) expressionBody                         #exprAdditive
  | expressionBody op=(GT | GE | LT | LE | SAME | NOT_EQ) expressionBody    #exprRelational
  | expressionBody op=(AND | OR) expressionBody                             #exprLogical
  | LPAREN expressionBody RPAREN                                            #exprPar
  | NEGATION expressionBody                                                 #exprNeg
  ;

forControl
  : LPAREN identifier EQ DECIMAL '...' DECIMAL RPAREN
  ;

switchBlockStatement
  : CASE DECIMAL COLON body
  | DEFAULT COLON body
  ;

methodDeclaration
  : methodReturnType FUNCTION_KEYWORD identifier LPAREN methodParameter? RPAREN methodBody
  ;

methodParameter
  : (BOOLEAN | INT) identifier
  | (BOOLEAN | INT) identifier COMMA methodParameter
  ;

methodBody
  : LBRACE blockBody* RETURN (expressionBody)? SEMI RBRACE
  ;

methodCall
  : identifier LPAREN methodCallParameter? RPAREN
  ;

methodCallParameter
  : identifier
  | identifier COMMA methodCallParameter
  | methodCall
  | methodCall COMMA methodCallParameter
  ;
