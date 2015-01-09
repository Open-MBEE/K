
grammar Model;

model:
    packageDeclaration?
    importDeclaration* 
    topDeclarationList? 
    EOF
  ;

topDeclarationList: (topDeclaration SEP)*
  ;

topDeclaration:
    memberDeclaration 
  | classDeclaration 
  | assocDeclaration 
  ;

packageDeclaration:
    'package' qualifiedName SEP
  ;

importDeclaration:
    'import' qualifiedName ('.' '*')? SEP
  ;

memberDeclarationList:
  (memberDeclaration SEP)+ 
  ;

assocMemberDeclarationList:
  (assocMemberDeclaration SEP)+ 
  ;

classDeclaration:
    'class' Identifier typeParameters? extending? ('{' memberDeclarationList? '}')? 
  ;

assocDeclaration:
    'assoc' Identifier  '{' assocMemberDeclarationList? '}'
  ;

typeParameters:
      '[' typeParameter (',' typeParameter)* ']'
    ;

typeParameter:
      Identifier (':' typeBound)?
    ;

typeBound:
      type ('+' type)*
    ;
      
extending:
    'extends' type (',' type)*
  ;

type:
    primitiveType                   # PrimType
  | qualifiedName typeArguments?    # IdentType
  | type ('*' type)+          # CartesianType
  | type '->' type            # FuncType
  | '{' type '}'                    # SetType
  | '[' type ']'                    # ListType
  | '<' type ',' type '>'           # MapType
  | '(' type ')'					# ParenType
  | '{|' Identifier ':' type  SUCHTHAT expression '|}' # SubType 
  | type '?' # OptionalType
  ;

expressionOrStar:
    expression
    | '*'
    ;

typeArguments:
    '[' type (',' type)* ']'
  ;

memberDeclaration:
    sortDeclaration 
  | typeDeclaration 
  | valueDeclaration 
  | variableDeclaration
  | functionDeclaration
  | constraint 
  | expression
  ;

assocMemberDeclaration:
    roleDeclaration
  | memberDeclaration
  ;

valueDeclaration:
    'val' pattern ('=' expression)? 
  ;

sortDeclaration:
    'type' Identifier 
  ;

typeDeclaration:
    'type' Identifier typeParameters? '=' type 
  ;

variableDeclaration:
    'var' pattern ('=' expression)? 
  ;

roleDeclaration:
    partDeclaration
  | refDeclaration
  ;

partDeclaration:
    'part' Identifier ':' Identifier multiplicity?
    ;

refDeclaration:
    'ref' Identifier ':' Identifier multiplicity?
    ;

multiplicity:
    expressionOrStar ('..' expressionOrStar)?
    ;

functionDeclaration:
    shortFunctionDeclaration
  | longFunctionDeclaration
  ;

shortFunctionDeclaration:
    'fun' Identifier ('(' patternList? ')')+ (':' type)? ('='expression)?
  ;

longFunctionDeclaration:
    'fun' Identifier ('(' patternList? ')')+ (':' type)? 
    functionSpecification*
    ('{' memberDeclarationList? '}')?
  ;

functionSpecification:
    'pre'  expression 
  | 'post' expression   
  ;

constraint:
    'req' (Identifier ':')?  expression
  ;

primitiveType:
    'Bool'
  | 'Char'
  | 'Int'       // Scala bigint (arbitrary precision)
  | 'Real'      // double
  | 'String'
  | 'Unit'  
  ;

tokenEnd: 
    'end' 
    ;
    
expression: 
    '(' expression ')' #ParenExp
  | '(' expression (',' expression)+ ')' #TupleExp
  | literal #LiteralExp
  | Identifier #IdentExp
  | expression '.' Identifier #DotExp
  | expression '(' argumentList? ')' #AppExp

  | 'if' expression 'then' memberDeclarationList? ('else' memberDeclarationList?)? tokenEnd #IfExp
  | 'match' expression 'with' match+ 'end' #MatchExp

  | 'while' expression 'do' memberDeclarationList? tokenEnd #WhileExp
  | 'for' '(' pattern 'in' expression ')' 'do' memberDeclarationList? tokenEnd # ForExp 
 
  | '!' expression #NotExp
  | 'forall' rngBindingList SUCHTHAT expression #ForallExp 
  | 'exists' rngBindingList SUCHTHAT expression #ExistsExp 
  | '{' expressionList? '}' #SetEnumExp
  | '{' expression '..' expression '}' #SetRngExp
  | '{' expression '|' rngBindingList SUCHTHAT expression '}' #SetCompExp 
  | '[' expressionList? ']' #ListEnumExp
  | '[' expression '..' expression ']' #ListRngExp
  | '[' expression '|' pattern 'in' expression SUCHTHAT expression ']' #ListCompExp 
  | '<' mapPairList? '>' #MapEnumExp
  | '<' mapPair '|' rngBindingList SUCHTHAT expression '>' #MapCompExp 
  | expression ('*'|'/'|'%'|'inter'|'\\'|'++'|'#'|'^') expression #BinOp1Exp
  | expression ('+'|'-'|'union') expression #BinOp2Exp
  | expression ('<=' | '>=' | '<' | '>' | '=' | '!=' | 'isin'|'!isin'|'subset'|'psubset') expression #BinOp3Exp
  | expression '&&' expression #AndExp
  | expression '||' expression #OrExp
  | expression ('=>' | '<=>') expression #IFFExp
  | expression ':=' expression #AssignExp
  | expression 'is' type # TypeCheckExp
  | expression 'as' type # TypeCastExp
  | 'assert' '(' expression ')' #AssertExp 
  | '~' expression #NegExp
  | pattern '->' expression #LambdaExp
  | 'continue' #ContinueExp
  | 'break' #BreakExp
  | 'return' expression? #ReturnExp
  | '$' #ResultExp
  ;

argumentList: 
    positionalArgumentList #PosArgList
  | namedArgumentList # NamedArgList
  ;

positionalArgumentList:
    expression (',' expression)* 
    ;

namedArgumentList:
   namedArgument (',' namedArgument)* 
  ;

namedArgument :
    Identifier '=' expression
  ;

match:
  'case' pattern ('|' pattern)* '=>' expression 
  ;

mapPairList:
    mapPair (',' mapPair)*
  ;

mapPair:
    expression ':' expression 
  ;

rngBindingList:
    rngBinding (',' rngBinding)*
  ;

rngBinding:
    patternList ':' collectionOrType
  ;

patternList:
    pattern (',' pattern)*
  ;

collectionOrType:
    expression
  | type
  ;
  
pattern:
    literal # LiteralPattern
  | '_' #DontCarePattern   
  | Identifier #IdentPattern
  | '(' pattern (',' pattern)+ ')' #CartesianPattern  
  | pattern ':' type # TypedPattern
  ;
  
identifierList:
    Identifier (',' Identifier)*
  ;

expressionList:
    expression (',' expression)*
  ;
    
qualifiedName:
    Identifier ('.' Identifier)*
  ;

literal:
    IntegerLiteral
  | FloatingPointLiteral
  | CharacterLiteral
  | StringLiteral
  | BooleanLiteral
  | NullLiteral
  | ThisLiteral
  ;

SUCHTHAT :
    '.' 
  ;

IntegerLiteral:
      DecimalIntegerLiteral
    | HexIntegerLiteral
    | OctalIntegerLiteral
    | BinaryIntegerLiteral
    ;

fragment
DecimalIntegerLiteral:
      DecimalNumeral IntegerTypeSuffix?
    ;

fragment
HexIntegerLiteral:
      HexNumeral IntegerTypeSuffix?
    ;

fragment
OctalIntegerLiteral:
      OctalNumeral IntegerTypeSuffix?
    ;

fragment
BinaryIntegerLiteral:
      BinaryNumeral IntegerTypeSuffix?
    ;

fragment
IntegerTypeSuffix:
      [lL]
    ;

fragment
DecimalNumeral:
      '0'
    |   NonZeroDigit (Digits? | Underscores Digits)
    ;

fragment
Digits:
      Digit (DigitOrUnderscore* Digit)?
    ;

fragment
Digit:
      '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit:
      [1-9]
    ;

fragment
DigitOrUnderscore:
      Digit
    |   '_'
    ;

fragment
Underscores:
      '_'+
    ;

fragment
HexNumeral:
      '0' [xX] HexDigits
    ;

fragment
HexDigits:
      HexDigit (HexDigitOrUnderscore* HexDigit)?
    ;

fragment
HexDigit:
      [0-9a-fA-F]
    ;

fragment
HexDigitOrUnderscore:
      HexDigit
    |   '_'
    ;

fragment
OctalNumeral:
      '0' Underscores? OctalDigits
    ;

fragment
OctalDigits:
      OctalDigit (OctalDigitOrUnderscore* OctalDigit)?
    ;

fragment
OctalDigit:
      [0-7]
    ;

fragment
OctalDigitOrUnderscore:
      OctalDigit
    |   '_'
    ;

fragment
BinaryNumeral:
      '0' [bB] BinaryDigits
    ;

fragment
BinaryDigits:
      BinaryDigit (BinaryDigitOrUnderscore* BinaryDigit)?
    ;

fragment
BinaryDigit:
      [01]
    ;

fragment
BinaryDigitOrUnderscore:
      BinaryDigit
    |   '_'
    ;

FloatingPointLiteral:
      DecimalFloatingPointLiteral
    |   HexadecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral:
      Digits '.' Digits? ExponentPart? FloatTypeSuffix?
    |   '.' Digits ExponentPart? FloatTypeSuffix?
    |   Digits ExponentPart FloatTypeSuffix?
    |   Digits FloatTypeSuffix
    ;

fragment
ExponentPart:
      ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator:
      [eE]
    ;

fragment
SignedInteger:
      Sign? Digits
    ;

fragment
Sign:
      [+-]
    ;

fragment
FloatTypeSuffix:
      [fFdD]
    ;

fragment
HexadecimalFloatingPointLiteral:
      HexSignificand BinaryExponent FloatTypeSuffix?
    ;

fragment
HexSignificand:
      HexNumeral '.'?
    |   '0' [xX] HexDigits? '.' HexDigits
    ;

fragment
BinaryExponent:
      BinaryExponentIndicator SignedInteger
    ;

fragment
BinaryExponentIndicator:
      [pP]
    ;

BooleanLiteral:
      'true'
    |   'false'
    ;

NullLiteral:
  'null'
  ;

ThisLiteral:
  'this'
  ;

CharacterLiteral:
      '\'' SingleCharacter '\''
    |   '\'' EscapeSequence '\''
    ;

fragment
SingleCharacter:
      ~['\\]
    ;
    
StringLiteral:
      '"' StringCharacters? '"'
    ;

fragment
StringCharacters:
      StringCharacter+
    ;

fragment
StringCharacter:
      ~["\\]
    |   EscapeSequence
    ;

fragment
EscapeSequence:
      '\\' [btnfr"'\\]
    |   OctalEscape
    |   UnicodeEscape
    ;

fragment
OctalEscape:
      '\\' OctalDigit
    |   '\\' OctalDigit OctalDigit
    |   '\\' ZeroToThree OctalDigit OctalDigit
    ;

fragment
UnicodeEscape:
      '\\' 'u' HexDigit HexDigit HexDigit HexDigit
    ;

fragment
ZeroToThree:
      [0-3]
    ;

Identifier:
      JavaLetter JavaLetterOrDigit*
    ;

fragment
JavaLetter:
      [a-zA-Z$_] // these are the "java letters" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierStart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

fragment
JavaLetterOrDigit:
      [a-zA-Z0-9$_] // these are the "java letters or digits" below 0xFF
    |   // covers all characters above 0xFF which are not a surrogate
        ~[\u0000-\u00FF\uD800-\uDBFF]
        {Character.isJavaIdentifierPart(_input.LA(-1))}?
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
        {Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
    ;

CommentBorder:
   '===' '='* 
   ;

COMMENT :
     CommentBorder .*? CommentBorder -> skip
  ;

LINE_COMMENT:
    '--' ~[\r\n]* -> skip
  ;

WS:
    [ \t\r\n\u000C]+ -> skip
  ;

SEP:
    ';'
  ;

