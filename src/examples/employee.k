class Person {
  age : Int
  
  fun getAge : Int {
    age 
  }
 
  req getAge() > 18

}

class Employee extends Person {

  boss : Person
  officemate : Employee

  fun avoid(p : Person) : Bool {
    officemate != p
  }

  req boss.age > 30
 
  req this = officemate.officemate
  
}