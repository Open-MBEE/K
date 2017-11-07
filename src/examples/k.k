=====

A start on a formal specification of K in K

=====


package k.reflect

-- Captures common features of k language elements.
-- REVIEW - Could this be used to hold metadata such as ID or version?
class kelement {
    -- Constraints placed on ktext specifies syntax and encodes a k parser as a problem to solve.
    -- For example, for a class, ktext is what the class looks like in k and may be the user-edited version
    var ktext : String
}

class kmodel extends kclass {
    -- TODO - need to differentiate ktext to not include the actual class part
}

class kclass extends kelement {
    var name : String
    var superclasses : kclass [0,*]
    var definedPoperties : kproperty [0,*]
    var allProperties : kproperty [0,*]
    var constructors : kconstructors [0,*]
    var functions : kfunction [0,*]
    var constraints : kconstraint [0,*]
    -- Allow classes to be defined inside classes
    var classes : kclass [0,*]

    var members : Set[kelement] = Set{definedProperties, constructors, functions, constraints}.flatten()

    ktext = "class" + ws
}

class kproperty extends kelement {
    var name : String
    var type : kclass
    var multiplicity : IntRange
    var value : kobject
}

class IntRange extends kelement {
    val star : Int = java.lang.Integer.MAX_VALUE
    var min : Int
    var max: Int
    req max >= min
}

class function extends kclass {
    var parameters : kproperty [0,*]
    var returnExpression : kexpression
}

class kconstraint extends kelement {
    var name : String
    var expression : kexpression
    req expression.type = Boolean
}

class kexpression extends kelement {
    -- the expected type of the expression
    var type : kclass
}
class kstring extends kexpression {
    req type = String
    var string : String
}
-- whitespace
class ws extends kstring {
    req string.matches("\\p{javaWhitespace}+")
}
-- optional whitespace
class ows extends kstring {
    req string.matches("\\p{javaWhitespace}*")
}
class kbinary extends kexpression {
    var exp1 : kexpression
    var op: koperator
    var exp2 : kexpression
    req ktext = exp1.ktext + ows().ktext + exp2.ktext
}

class koperator extends kelement
class andOp extends koperator {
    req ktext = "&&" 
}
class plusOp extends koperator {
    req ktext = "+" 
}
class eqOp extends koperator {
    req ktext = "=" 
}
class kcall extends 
class kconstructorCall extends kcall {
    var class : kclass
    var constructor : kconstructor
    req constructor isin class.constructors
    var method = constructor
}
class kobject extends kexpression {
    var class : kclass
    var constructor : kconstructor
    req constructor isin class.constructors
    var constructorCall : kconstructorCall(constructor)
    req ktext = constructorCall.ktext
}

-- class kobject {  -- extends java.lang.Object {
-- }

-- native classes

native class Integer
native class Double
native class Boolean
native class Int
native class Real
native class Bool
native class String
native class Char

native class Object
native class Class

native class  
native class 
native class 
native class 
native class 
native class 
native class 
native class 
native class 
native class 
native class 
