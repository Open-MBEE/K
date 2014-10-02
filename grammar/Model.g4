
grammar Model;

// All changes made to make the spacecraft example parse and higlighted by a one-line comment of the form
//   ;; this has changed bla bla bla

model
  : packageDeclaration 
    importDeclaration* 
    topDeclaration*
    EOF
  ;

topDeclaration
  : memberDeclaration
  | classDeclaration
  // | expressionsWithSeparator ;; deleted, moved into memberDeclaration
  ;

packageDeclaration
  : 'package' qualifiedName
  ;

importDeclaration
  : 'import' qualifiedName ('.' '*')?
  ;

classDeclaration
  : classToken Identifier typeParameters? valueParameters? extending? '{' memberDeclaration* '}' 
     // ;; removed semicolon after each memberDeclaration, since it occurs as part of memberDeclarations
  ;

classToken
    : 'class'
    | 'assoc'
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
  | qualifiedName typeArguments?    // ;; changed Identifier to qualifiedName
  | type ('*' type)+                // cartesian product
  | type '->' type                  // function type
  | '(' type ')'
  | '{|' typing SUCHTHAT expression '|}' // predicate subtype ;; changed '.' to SUCHTHAT
  | '{' type '}'                    // set {Int} {1,2}
  | '[' type ']'                    // list [Int] [1,2,2,2,2]
  | '<' type ',' type '>'           // map from first type to next <Int,String> <1:"one", 2:"two">
  | type expressionOrStar ('..' expressionOrStar)? // type with size specified type People = {Person} 0..100 OR 
                                                   // type People = {Person}, var x : People 0 .. 10 OR
                                                   // var city : [Person] 0 .. 1000
  | type '?' 
  ;

expressionOrStar
    : expression
    | '*'
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
  | expressionsWithSeparator // ;; added (moved to here)
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

//functionBodyElement        ;; deleted non-terminal
//  : memberDeclaration
//| expressionsWithSeparator ;; deleted, now in memberDeclaration
//  ;

functionDeclaration
  : 'def' Identifier ('(' typingList? ')')+ (':' type) '{' memberDeclaration* '}' 
      // ;; added ? to typingList
      // ;; replace functionBodyElement with memberDeclaration
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
  | 'Unit'  // ;; played around with other options such as Unit
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

/* ;; operator precedences from Scala K grammar
HIGEST
    "*" | "/" | "%" |
      "inter" | "++" | "#" | "^"

    "+" | "-" | "union"

    "<=" | ">=" | "<" | ">" |
      "=" | "!=" |
      "isin" | "!isin" | "subset" | "psubset"

    "and"

    "or"

    "=>" | "<=>"
LOWEST
*/

expression // ;; moved around on bin infix expressions to control precedence, highest first
  : '(' expression ')'
  | literal
  | Identifier
  | expression '.' Identifier
  //| 'create' expression  // calls to constructor ;; edited to the line below
    | 'create' qualifiedName ('(' classArgumentList? ')')? // ;; added, see line above
  | expression expression
  | 'if' expression 'then' expression 'else' expression
  | 'case' expression 'of' match
  | '-' expression // ;; added
  | tokenNot expression
  | 'forall' rngBindingList SUCHTHAT expression // ;; introduced SUCHTHAT
  | 'exists' rngBindingList SUCHTHAT expression // ;; introduced SUCHTHAT
  | '(' expression (',' expression)+ ')'
  | '{' expressionList? '}'
  | '{' expression '..' expression '}'
  | '{' expression '|' rngBindingList SUCHTHAT expression '}' // ;; introduced SUCHTHAT
  | '[' expressionList? ']'
  | '[' expression '..' expression ']'
  | '[' expression '|' pattern ':' expression SUCHTHAT expression ']'  // ;; introduced SUCHTHAT
  | '{' mapPairList? '}'
  | '{' mapPair '|' rngBindingList SUCHTHAT expression '}' // ;; introduced SUCHTHAT
  | '-\\' pattern (':' type)? SUCHTHAT expression // ;; introduced SUCHTHAT
  | expression ('*'|'/'|'%'|'inter'|'\\'|'++'|'#'|'^') expression
  | expression ('+'|'-'|'union') expression
  | expression 
      (
         tokenLessThanEqual | tokenGreaterThanEqual | tokenLessThan | tokenGreatherThan 
       | tokenEquals | tokenNot tokenEquals
       | 'isin'|'!isin'|'subset'|'psubset' 
      ) 
    expression
  | expression tokenAnd expression
  | expression tokenOr expression
  | expression (tokenImplies | tokenIFF) expression
  | expression ':=' expression
  // --------
  // Records:
  // --------  
  //| /*class*/expression '@' '{' idValueList '}' ;; deleted for now.
  ;

classArgumentList // ;; added this rule
  : classArgument (',' classArgument)*
  ;

classArgument // ;; added this rule
  : Identifier ':' expression
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
  : expression ':' expression // ;; changed from -> to :, as we agreed on I think.
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
  
// letBindingList ;; deleted, not used
//  : letBinding (',' letBinding)*
//  ;
  
// letBinding ;; deleted, not used
//  : pattern (':' type)? '=' expression
//  ;  

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

SUCHTHAT // ;; added, so we can change it easily
  : '.' // ;; changed from colon since that conflicts with typings
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

//COMMENT ;; deleted this
//  : '---' .*? '---' -> skip
//  ;

fragment // ;; added this
CommentBegin
   : '---' '-'*
   | '===' '='* // to experiment with different ways of showing start of comment
   ;

fragment // ;; added this
CommentEnd
   : '---' '-'*
   ;

COMMENT // ;; added this
  :  CommentBegin .*? CommentEnd -> skip
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
