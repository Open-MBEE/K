
grammar Model;

model
  : packageDeclaration 
    importDeclaration* 
    classDeclaration* 
    topDeclaration*
    EOF
  ;

topDeclaration
  : memberDeclaration
  | classDeclaration
  | expressionsWithSeparator
  ;

packageDeclaration
  : 'package' qualifiedName
  ;

importDeclaration
  : 'import' qualifiedName ('.' '*')?
  ;

classDeclaration
  : 'class' Identifier typeParameters? valueParameters? extending? '{' (memberDeclaration ';'?)* '}'
  ;

typeParameters
    :   '[' typeParameter (',' typeParameter)* ']'
    ;

typeParameter
    :   Identifier (':' typeBound)?
    ;

typeBound
    :   type ('+' type)*
    ;

valueParameters
  : '(' typingList ')'
  ;
    
typingList
  : typing (',' typing)*    
  ;
  
extending
  : 'extends' type (',' type)*
  ;

type
  : primitiveType
  | Identifier typeArguments?
  | type ('*' type)+                 // cartesian product
  | type '->' type                   // function type
  | '(' type ')'
  | '{|' typing '.' expression '|}' // predicate subtype
  | '{' type '}'                    // set {Int} {1,2}
  | '[' type ']'                    // list [Int] [1,2,2,2,2]
  | '<' type ',' type '>'           // map from first type to next <Int,String> <1:"one", 2:"two">
  ;

typeArguments
  : '[' type (',' type)* ']'
  ;

memberDeclaration
  : sortDeclaration 
  | typeDeclaration
  | valueDeclaration
  | variableDeclaration
  | functionDeclaration 
  | constraint
  ;

valueDeclaration
  : 'val' typing ('=' expression)? ';'
  ;

sortDeclaration
  : 'type' Identifier ';'
  ;

typeDeclaration
  : 'type' Identifier typeParameters? '=' type ';'
  ;

variableDeclaration
  : 'var' typing ('=' expression)? ';'
  ;

typing
  : Identifier ':' type
  ; 

functionBodyElement
  : memberDeclaration
  | expressionsWithSeparator
  ;

functionDeclaration
  : 'def' Identifier ('(' typingList ')')+ (':' type) '{' functionBodyElement* '}' 
  ;

constraint
  : 'req' Identifier? '{' expression '}' 
  ;

primitiveType
  : 'Bool'
  | 'Char'
  | 'Int'       // Scala bigint (arbitrary precision)
  | 'Real'      // double
  | 'String'
  | 'Void'
  | 'Nada'
  ;

tokenLessThan
    : '<' 
    | 'lt'
    ;
tokenGreatherThan
    : '>'
    | 'gt'
    ;
tokenLessThanEqual
: '<='
| 'lte'
;
tokenGreaterThanEqual
    : '>='
    | 'gte'
    ;
tokenAnd
    : '&&' 
    | 'and'
    ;
tokenOr
    : '||'
    | 'or'
    ;
tokenNot
    : '!'
    | 'not'
    ;
tokenImplies
    : '=>'
    | 'implies'
    ;
tokenIFF
    : '<=>'
    | 'iff'
    ;
tokenEquals
    : '='
    | 'eq'
    ;

expressionsWithSeparator
    : expression ';'
    ;

expression
 // --------
 //  Common:
 // --------
  : '(' expression ')'
  | literal
  | Identifier
  | expression '.' Identifier
  | 'create' expression             // calls to constructor
  | expression expression
  | 'if' expression 'then' expression 'else' expression
  | 'case' expression 'of' match
 // -----------
 // Assignment
 // This also does structural assignment
 // assignment to functions
 // -----------
  | expression ':=' expression
  //| (expression '.')? Identifier ':=' expression
    
 // -----------
 // Arithmetic:
 // -----------
  | expression ('*'|'/'|'%') expression
  | expression ('+'|'-') expression
 // ---------
 // Booleans:
 // ---------
  | tokenNot expression
  | expression (tokenLessThanEqual | tokenGreaterThanEqual | tokenLessThan | tokenGreatherThan) expression
  | expression ('isin'|'!isin'|'subset'|'psubset') expression
  | expression (tokenEquals | tokenNot tokenEquals) expression
  | expression tokenAnd expression
  | expression tokenOr expression
  | expression (tokenImplies | tokenIFF) expression
  | expression '.#' expression
  | 'forall' rngBindingList ':' expression
  | 'exists' rngBindingList ':' expression
 // -------
 // Tuples:
 // -------
  | '(' expression (',' expression)+ ')'
 // -----
 // Sets:
 // -----
  | expression ('union'|'inter'|'\\') expression
  | '{' expressionList? '}'
  | '{' expression '..' expression '}'
  | '{' expression '|' rngBindingList '.' expression '}'
  // ------
  // Lists:
  // ------
  | expression ('^') expression
  | '[' expressionList? ']'
  | '[' expression '..' expression ']'
  | '[' expression '|' pattern ':' expression '.' expression ']'  
  // -----
  // Maps:
  // -----
  | /*map*/expression '++' /*map*/expression
  | '{' mapPairList? '}'
  | '{' mapPair '|' rngBindingList '.' expression '}'
  // ----------
  // Functions:
  // ----------
  | '-\\' pattern (':' type)? '.' expression
  // --------
  // Records:
  // --------  
  | /*class*/expression '@' '{' idValueList '}'  
  ;

idValueList
  : idValuePair (',' idValuePair)*
  ;

idValuePair
  : Identifier ':=' expression
  ;

match
  : matchPattern '=>' expression ('|' match)?
  ;

matchPattern
  : literal
  | '_'
  | Identifier ('(' matchArgument (',' matchArgument)*  ')')?
  | '(' matchPattern (',' matchPattern)+ ')'
  ;

matchArgument
  : Identifier '=' matchPattern
  ;

mapPairList
  : mapPair (',' mapPair)*
  ;

mapPair
  : expression '->' expression
  ;

rngBindingList
  : rngBinding (',' rngBinding)*
  ;

rngBinding
  : patternList ':' collectionOrType
  ;

patternList
  : pattern (',' pattern)*
  ;

collectionOrType
  : expression
  | type
  ;
  
letBindingList
  : letBinding (',' letBinding)*
  ;
  
letBinding
  : pattern (':' type)? '=' expression
  ;  

pattern
  : Identifier
  | '(' pattern (',' pattern)+ ')'  
  ;
  
identifierList
  : Identifier (',' Identifier)*
  ;

expressionList
  : expression (',' expression)*
  ;
    
qualifiedName
  : Identifier ('.' Identifier)*
  ;

literal
  : IntegerLiteral
  | FloatingPointLiteral
  | CharacterLiteral
  | StringLiteral
  | BooleanLiteral
  ;

IntegerLiteral
    :   DecimalIntegerLiteral
    |   HexIntegerLiteral
    |   OctalIntegerLiteral
    |   BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral
    :   HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral
    :   OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral
    :   BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix
    :   [lL]
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits
    :   Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

fragment
DigitOrUnderscore
    :   Digit
    |   '_'
    ;

fragment
Underscores
    :   '_'+
    ;

fragment
HexNumeral
    :   '0' [xX] HexDigits
    ;

fragment
HexDigits
    :   HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit
    :   [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore
    :   HexDigit
    |   '_'
    ;

fragment
OctalNumeral
    :   '0' Underscores? OctalDigits
    ;

fragment
OctalDigits
    :   OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit
    :   [0-7]
    ;

fragment
OctalDigitOrUnderscore
    :   OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral
    :   '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits
    :   BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit
    :   [01]
    ;

fragment
BinaryDigitOrUnderscore
    :   BinaryDigit
    |   '_'
    ;

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [eE]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

fragment
FloatTypeSuffix
    :   [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral
    :   HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand
    :   HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent
    :   BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator
    :   [pP]
    ;

BooleanLiteral
    :   'true'
    |   'false'
    ;

CharacterLiteral
    :   '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;
    
StringLiteral
    :   '"' StringCharacters? '"'
    ;

fragment
StringCharacters
    :   StringCharacter+
    ;

fragment
StringCharacter
    :   ~["\\]
    |   EscapeSequence
    ;

fragment
EscapeSequence
    :   '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape
    :   '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape
    :   '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree
    :   [0-3]
    ;

Identifier
    :   JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter
    :   [a-zA-Z$_] // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
JavaLetterOrDigit
    :   [a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

COMMENT
  : '---' .*? '---' -> skip
  ;

LINE_COMMENT
  : '--' ~[\r\n]* -> skip
  ;

WS
  : [ \t\r\n\u000C]+ -> skip
  ;

SEP
  : ';'
  ;