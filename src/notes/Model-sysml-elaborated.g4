
/* Model 1 - only using relations:

enum Gender{male,female}

class Bank {}

class Person {
  var isMarried : Boolean;
  var isUnemployed : Boolean;
  var birthDate : Date;
  var age : Integer;
  var firstName : String;
  var lastName : String;
  var gender : Gender;
  
  def income(date: Date): Integer;
}

class Company {
  var name : String;
  var numberOfEmployees : Integer;
  
  def stockPrice(): Real;
}

assoc BankCustomerRelation {
  rel bank : Bank [0,1]
  rel customer : map Integer to Person [0,*] // weird
}

assoc PersonCompanyManagement {
  rel manager : Person [1];
  rel managedCompanies : Company [0..*]; 
}

// Could also be expressed as:

class Person {
  ...
  rel manager : Self [1] - managedCompanies : Company [0..*]
  ...
}

assoc Job {
  role employee : Person [0,*]
  role employer : Company [0,*]

  val title : String
  val startDate : Date
  val salary : Integer
}

assoc Marriage {
  rel wife : Person [0,1]
  rel husband : Person [0,1]
}

*/

/* Model 2 using data types:

enum Gender{male,female}

class Bank {
  type AccountNumber = Integer;
  var customer : <AccountNumber,Person> // missing constraints 0..1 and 0..*
}

class Person {
  val isMarried : Boolean
  val isUnemployed : Boolean
  val birthDate : Date
  val age : Integer
  val firstName : String
  val lastName : String
  val gender : Gender

  val managedCompanies: Set[Company] // missing constraints 1 and 0..* and manager
  
  def income(date: Date): Integer

  // say the constraints were 1 and 0..10 (a manager can mange up to 10 companies):

  constraint {
    forall c : Company . 
      { p : Person | c isin p.managedCompanies }.size() = 1
  }

  constraint {
    forall p : Person .
      managedCompanies.size() <= 10
  }
}

class Company {
  val name : String
  val numberOfEmployees : Integer
    
  def stockPrice(): Real
}

assoc Job {
  val employee : Person  [0.*]
  val employer : Company [0,*]

  val title : String
  val startDate : Date
  val salary : Integer

  constraint {
    forall p : Person .
      {j : Job | j.employee = p}.size() <= *
  }

  constraint {
    forall c : Company .
      {j : Job | j.employer = c}.size() <= *
  }
}

assoc Marriage {
  val husband : Person [0,1]
  val wife    : Person [0,1]

  val place   : String
  val date    : Date  

  constraint {
    
  }
}

*/

/*

It seems they want thse constraints.
They also want relations to be specified separatelty.
If constraints are specified separately, then these constraints cannot be
simply predicate subtypes. That is Suppose a constraint was defined as a 
property:

  class Person {
    val drives : setof Car size 0..10 
  }

where this meant:

  class Person {
    val drives : {| cs : {Car} | cs.size() <= 10}
  }

Then it would be confusing if writing a relation would mean something else.

This leads back to the notation suggested.

assoc CarSale {
  cars : setof Car [1,10]
  person : Person 
}

So what does this mean. It means that for any person, he can only participate in
a car sale to at most 10 sets of cars. It is confusing since it looks as if it is
one car sale can involve at most 10 cars.

class Person {
  role drives : Car 0..10 opposite driver 1;

It seems that we need a special relation notation.}

There are three kinds of relational notations:

1) inside a class
2) in a relation class
3) shorthandish

Why is this better than data types???

Here is how we would do it with types:






class Bank {
  customer : Map[Integer,Person] // 0..1 - 0..10

  con {
    forall p : Person .
      {b : Bank | p isin b.customer.values} <= 1
  }

  con {
    forall b : Bank .
      b.customer.values.size <= 10      
  }
}

class Person {
  managedCompanies : Set[Company] // 1 - 0..10
}

class Job extends Relation {
  employee : Person  // 0..10
  employer : Company // 0..20
}

*/

