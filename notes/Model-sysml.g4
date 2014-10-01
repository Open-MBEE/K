
Rahul,

// Below is a suggestion for a syntax for these relations based on the good disucssions we have
// had so far. Clearly we need the face to face discussions, but I think we are well
// prepared for that.

// I wrote the following in an emacs file in ANTLR mode, getting nice coloring,
// hence informal text is in comments. A comment usually refers to the grammar rule 
// which follows the comment.


// So, the top level looks as folows, as before (after removing memberDeclatation which
// was unnecessary since toplevelDeclaration contains it):

model
  : packageDeclaration 
    importDeclaration* 
    topDeclaration*
    EOF
  ;

// A top level declaration can be a memberDeclaration as before, and 
// unitDeclaration. It changed name from classDeclaration
// since it now can be either a class declaration or an association declaration:
 
topDeclaration
  : memberDeclaration
  | unitDeclaration 
  ;

// A unit declaration only differs from our previous class declarations by allowing the
// keyword 'assoc' as an alternative to 'class'. The idea of an association class is to
// highlight that here an association is defined. Obviously we need to make precise what
// this means and what one can do with such units:

unitDeclaration 
  : ('class'|'assoc') Identifier typeParameters? valueParameters? extending? '{' memberDeclaration* '}' 
  ;

// Now, a member declaration is augmented with a single additional alternative, namely relDeclaration:

memberDeclaration
  : sortDeclaration 
  | typeDeclaration
  | valueDeclaration
  | variableDeclaration
  | relDeclaration // <--- new
  | functionDeclaration 
  | constraint
  | expressionsWithSeparator
  ;

// A single such relation declaration can introduce one or two roles, if two, separated by
// an association arrow such as ->, <-, -,  etc. as in Umple Grammar:

relDeclaration 
  : 'rel' role (relArrow role)? ';'

// A role consists of a name of the role, its type (represented by a qualifiedName), 
// and an optional multiplicity, with the meaning that a missing multiplicity corresponds 
// to multiplicity [1] - exactly one:

role 
  : Identifier ':' qualifiedName multiplicity?
  ;

// with respect to multiplicties, we may need to introduce a *::

multiplicity
    : '[' expression ',' expressionOrStar ']' 
    | '[' expressionOrStar ']'
    ;

// With this grammar we can write classes and associations as follows.

/*

We can define a class Person with a relation to another class Car:

  class Person {
    rel driver : Self -> drives : Car[*]    
  }

Note that the syntax requires a type in each role hence the Self type.
This is a starting point for discussion for example. May be too verbose.
The alterative is to introduce special syntax for those relations that occur
in a class, as in Umple where inlineAssociation plays this special role.

Here is a 3-ary relation defined as an association (obviously we need to get
the terminology right also: relation, relationship, association, ...):

  assoc CarPurchase {
    rel person : Person;
    rel car : Car;
    rel dealer : Dealer;
  }

Each instance of CarPurchase is meant to represent one sale of a car to one person
through one dealer. Note that we could allow [1,*] multiplicity on car, indicating
a sale of a set of cars. I don't think SysML allows this.

We can also, as you suggested, write a bunch of binary relations hence
reducing the amount of typing:

  assoc MyRelations {
    rel driver : Persion -> drives : Car[*]
    rel home : City[1] - resident : Person[*] 
  }

Now there are also some weird things one can write with this syntax, such as the
following  class, which defines a relation between two completely different classes
(different from Person):

  class Person {
    rel car : Car[*] - dealer : Dealer[1]    
  }

And the next one, that defines a car purchase, and then a 
completely different binary relation:

  assoc CarPurchase {
    rel person : Person;
    rel car : Car;
    rel dealer : Dealer;

    rel person : Person[*] - home : House[1]
  }

*/

Klaus
