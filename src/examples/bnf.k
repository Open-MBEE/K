package bnf

-- Model of BNF to be used for parsing

-- Exp is an expression that constrains the tokens in a string.
class Exp {
   var text: String  -- what it looks like in BNF
   var tokens: Seq[Exp]  -- the sequence of things in text that may be separated by whitespace
   var whitespaces: Seq[Whitespace]  -- the actual whitespace
   var tokensAndWhitespace: Seq[Exp]  -- the sequence of tokens and whitespace in text
   var textArray: Seq[String]

   -- tokens are separated by one or more whitespace chars
   req tokens.size() > 0 => forall i : Int :- Set{0 .. tokens.size()-1} => tokensAndWhitespace[2*i+1] = tokens[i]
   req tokens.size() > 0 => forall i : Int :- Set{0 .. tokens.size()} => tokensAndWhitespace[2*i] = whitespaces[i]
   req tokens.size() > 0 => forall i : Int :- Set{0 .. tokensAndWhitespace.size()-1} => textArray[i] = tokensAndWhitespace[i].text

   -- adjacent tokens must be sure to separate identifier chars with whitespace
   req tokens.size() > 1 =>
      forall i : Int :- Set{0 .. tokens.size()-2} =>
         (lastCharIsIdent(tokens[i].text) && firstCharIsIdent(tokens[i+1].text) =>
            whitespaces[i+1] is RequiredWhitespace)
   fun lastCharIsIdent( s: String ): Boolean {
      if s = null || s.length() = 0 then false else Character.isJavaIdentifierPart(substring(s.length()-1))
   }
   fun firstCharIsIdent( s: String ): Boolean {
      if s = null || s.length() = 0 then false else Character.isJavaIdentifierPart(substring(0, 1))
   }

   -- the text is the concatenation of tokens
   req tokens.size() > 0 => text = add(textArray)  -- if add fails, try fold(textArray, Plus.class)
}

class BNF extends Exp {
   var name: String
   var rules: Seq[Rule]
   var topRuleName: String
   var topRule: Rule

   req topRule.name = topRuleName
   req topRule isin rules

   fun parse( string: String ): ParseTree {
       ParseTree(string: string, rule: topRule)
   }

   fun ruleNames(): Set[String] {
       Set{ x.name | x: Rule :- x isin rules }
   }

   fun ruleForName(name: String): Rule {
       Seq{ x | x: Rule :- x isin rules && x.name = name }[0]
   }

   tokens = Seq{S(text:: "grammar"), S(text:: name), S(text:: ";")}.addAll(rules)
}

class TestBnf {
   var bnf: BNF
   req bnf.string = "grammar G; r1: 'I am' r2; r2: ' parseable';"
   bnf.topRuleName = "r1"
   var tree: ParseTree = bnf.parse( "I am parseable" )
}

class ParseTree {
   var string: String
   var rule: Rule
   var beginIndex: Int
   var endIndex: Int
   var children: Seq[ParseTree]

   var exp: rule.inducedExp(string)
   req exp.text = string

   -- TODO -- HERE!!! -- Can't connect inducedExpression back to rule from which it was induced!!

   req rule.text = string.substring(beginIndex, endIndex)
   req forall r: Exp :- r isin rule.tokens
}

class Whitespace extends S {
   forall i : Int :- i isin Set{0 .. text.length()-1} => Character.isWhitespace(text.charAt(i))
}
class RequiredWhitespace extends Whitespace {
   req text.size() > 0
}

class Rule extends Exp {
   var name: String
   var expression : RuleExp
   -- var childRules : Set[Rule] = Set{ x : Exp :- x isin tokens

   req tokens = Seq{S(text:: name), S{text, ":"), expression, S(text:: ";")}
}

-- an expression on the right hand side of of a rule
class RuleExp extends Exp {
    -- need a reference to all BNF rules
    var bnf: BNF

    var childRuleNames : Set[String] = Set{ x.text : Exp :- x isin tokens && x is Identifier }
    var childRules : Set[RuleExp] = Set{ x : RuleExp :- x.name isin childRuleNames }

    -- An expression induced by the interpretation of the BNF rule
    fun inducedExp( string: String ) : Exp
    -- var bnfExp: Exp
}


-- Simple string token; can be anything
class S extends Exp {
   req tokens.size() = 0
}

class Literal extends RuleExp {
   var string : String
   text = "'" + string + "'"

   -- An expression induced by the interpretation of the BNF rule
   fun inducedExp( s: String ) : Exp {
        S(text:: string)
   }
   -- bnfExp = S(text::string)

}

class Identifier extends RuleExp {
   req text.length() > 0 &&
   req Character.isJavaIdentifierStart(text.charAt(0)) &&
   req forall i : Int :- i isin Set{0 .. text.length()-1} => Character.isJavaIdentifierPart(text.charAt(i))

   -- An expression induced by the interpretation of the BNF rule
   fun inducedExp( s: String ) : Exp {
        if text = "skip" || text = "fragment" then S(text:: "")
        -- else if text = "EOF"
        else bnf.ruleForName(text).inducedExp(s)
   }
   -- bnfExp = bnf.ruleForName(text).expression.bnfExp
}

===== We are using RuleExp superclass to identify a set of classes that may be
      BNF rules, so we can't include this; otherwise this would match operator to anything.
      I guess this is a good reason to include abstract classes in K.
class BinaryRuleExp extends RuleExp {
    var left: RuleExp
    var right: RuleExp
    var operator: String
    tokens = Seq{left, S(text:: operator), right}
}
=====

class AndExp extends RuleExp {
    var left: RuleExp
    var right: RuleExp
    req tokens = Seq{left, right}

    class IE {
       var exp : Exp
       var s : String
       var s1 : String = s.substring(0,i)
       var s2 : String = s.substring(i)
       var i : Int
       req i isin Set{0 .. s.length()}
       req exp.tokens = Seq{left.inducedExp(s1), right.inducedExp(s2)}
    }
   -- An expression induced by the interpretation of the BNF rule
   fun inducedExp( s: String ) : Exp {
        IE(s:s).exp
        -- if left.inducedExp(s) is Exp then left.inducedExp(s) else right.inducedExp(s)
   }
}

class OrExp extends RuleExp {
    var left: RuleExp
    var right: RuleExp
    var operator: String = "|"
    req tokens = Seq{left, S(text:: operator), right}

    class IE {
       var exp : RuleExp
       req exp = left || exp = right
    }
   -- An expression induced by the interpretation of the BNF rule
   fun inducedExp( s: String ) : Exp {
        IE().exp.inducedExp(s)
        -- if left.inducedExp(s) is Exp then left.inducedExp(s) else right.inducedExp(s)
   }
   -- req bnfExp = left.bnfExp || bnfExp = right.bnfExp
}

class ParenExp extends RuleExp {
    var inner: RuleExp
    tokens = Seq{S(text::"("), inner, S(text::")")}

   -- An expression induced by the interpretation of the BNF rule
   fun inducedExp( s: String ) : Exp {
        ParenExp(text: s).inner
   }
}

class ZeroOrMoreExp extends RuleExp {
    var thExp: RuleExp
    req tokens = Seq{theExp, S(text:: "*")}

    class IE {
        var s: String
        var exp: Exp
        req exp = S(text:: "") || OneOrMoreExp(theExp:: theExp).inducedExp(s)
    }

   -- An expression induced by the interpretation of the BNF rule
   fun inducedExp( s: String ) : Exp {
        IE(s::s).exp
   }
}

class ZeroOrOneExp extends RuleExp {
    var thExp: RuleExp
    req tokens = Seq{theExp, S(text:: "?")}

    class IE {
        var s: String
        var exp: Exp
        req exp = S(text:: "") || exp = theExp.inducedExp(s)
    }

   -- An expression induced by the interpretation of the BNF rule
   fun inducedExp( s: String ) : Exp {
        IE(s::s).exp
   }
}

class OneOrMoreExp extends RuleExp {
    var thExp: RuleExp
    req tokens = Seq{theExp, S(text:: "+")}

    class IE {
        var s: String
        var exp: Exp
        req exp = exp = theExp.inducedExp(s) || exp = AndExp(left:: theExp, right:: OneOrMoreExp(theExp:: theExp)).inducedExp(s)
    }

   -- An expression induced by the interpretation of the BNF rule
   fun inducedExp( s: String ) : Exp {
        IE(s::s).exp
   }
}

class CharSet extends RuleExp {
    req text.substring(0,1) = "["
    req text.substring(text.length()-1) = "]"
    req !text.substring(1, text.length()-1).contains("[")
    req !text.substring(1, text.length()-1).contains("]")
}
class NegCharSet extends RuleExp {
    req text.substring(0,2) = "~["
    req text.substring(text.length()-1) = "]"
    req !text.substring(2, text.length()-1).contains("[")
    req !text.substring(2, text.length()-1).contains("]")
}



class LineComment extends RuleExp {
    var commentStart: String
    var commentText: String
    req !commentText.contains("\n")
    req commentStart = "#" || commentStart = "//"
    req tokens = Seq{ S(text:: commentStart), S(text:: commentText), S(text:: "\n") }
}

class MultiLineComment extends RuleExp {
    var commentStart: String = "/*"
    var commentText: String
    var commentEnd: String = "*/"
    req commentText.substring(0,1) != "/"
    req !commentText.contains("*/")
    req !commentText.contains("/*")
    req tokens = Seq{ S(text:: commentStart), S(text:: commentText), S(text:: commentEnd) }
}

