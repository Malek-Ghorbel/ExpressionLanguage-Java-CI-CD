grammar AmlDsl;
start:	expr EOF ;

expr
    : method                                    # MethodCall
    | object                                    # ObjectExpr
    | logical                                   # LogicalExpr
    | calc                                      # ArithmeticExpr
    | list                                      # ListInitExpr
    | (list | object | method) selection        # SelectionExpr
    ;

selection
    : DOT '?' LBRACKET expr RBRACKET
    ;

list
    : LBRACE expr (',' expr)*  RBRACE
    ;

method
    : ((object | list) selection? DOT)? IDENTIFIER LPAREN arguments RPAREN (DOT IDENTIFIER LPAREN arguments RPAREN)*        #ObjectMethod
    | HASHTAG IDENTIFIER LPAREN arguments RPAREN  (DOT IDENTIFIER LPAREN arguments RPAREN)*                                 #RegistredMethod
    ;

object
    : property                                                                              # PropertyAccess
    | (property | list ) selection? (LBRACKET expr RBRACKET)+ (DOT IDENTIFIER)*             # ListAccess
    | this                                                                                  # ThisObject
    ;

this
    : HASHTAG 'this'
    ;

property
    : (IDENTIFIER | STRING) (DOT IDENTIFIER)*
    ;

arguments
    : expr (',' expr)*                              # ArgumentsExpr
    |                                               # NoArguments
    ;

logical
    : logical op=('=='|'eq'|'!='|'ne') logical              # CompExpr
    | unaryLog                                              # UnaryLogExpr
    | logical op=('and' | 'AND' |AND) expr                  # AndExpr
    | logical op=('or' | 'OR' | OR) expr                    # OrExpr
    ;

unaryLog
    : memberLog                     # LogMember
    | (NOT|'not') memberLog         # LogicalNot
    ;

memberLog
    : LPAREN logical RPAREN         # NestedLog
    | relation                      # RelationExpr
    | (TRUE | FALSE)                # LogConstant
    ;

relation
    : calc op=('<'|'lt'|'<='|'le'|'>='|'ge'|'>'|'gt'|'=='|'eq'|'!='|'ne') calc
    ;

calc
    : unary                         # UnaryExpr
    | calc (MOD|'mod') calc         # CalcModulo
    | calc MULTIPLY calc            # CalcMultiplication
    | calc (SLASH|'div') calc       # CalcDivision
    | calc PLUS calc                # CalcPlus
    | calc MINUS calc           	# CalcMinus
    ;

unary
    : member                        # MemberExpr
    | MINUS member                  # Negate
    ;

member
    : LPAREN calc RPAREN                    # Nested
    | literal                               # ConstantLiteral
    | object                                # Identifier
    ;

literal
    : INT
    | FLOAT
    ;

fragment LETTER : 'A'..'Z' | 'a'..'z' ;
fragment DIGIT  : '0'..'9' ;
fragment EXPONENT : ('e' | 'E') ( '+' | '-' )? DIGIT+ ;
fragment HEXDIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

FLOAT: (
    DIGIT+ ('.' DIGIT+) EXPONENT?
    | DIGIT+ EXPONENT
    | '.' DIGIT+ EXPONENT?
    | DIGIT+ '.' DIGIT+ 'f'
    )
    ;
INT: ( DIGIT+ | '0x' HEXDIGIT+ );
TRUE : 'true';
FALSE : 'false';
WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+ -> skip;
IDENTIFIER : (LETTER | '_') ( LETTER | DIGIT | '_')*;
LPAREN : '(';
RPAREN : ')';
LBRACKET : '[';
RBRACKET : ']';
LBRACE : '{';
RBRACE : '}';
DOT : '.';
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
SLASH : '/';
MOD : '%';

NOT : '!' ;
EQUALS : '==' | 'eq';
NOT_EQUALS : '!=' | 'ne';
LESS : '<' | 'lt';
LESS_EQUALS : '<=' | 'le';
GREATER_EQUALS : '>=' | 'ge';
GREATER : '>' | 'gt';
AND : '&&' ;
OR : '||';
STRING: '\'' ~[']* '\'';

HASHTAG : '#';