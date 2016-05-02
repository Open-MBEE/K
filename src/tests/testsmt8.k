
class Person {
  age : Int

  fun getAge: Int {
    age
  }

  req getAge() > 18 
}

class Employee extends Person {
  boss : Person 
  officemate : Employee

  fun avoid(p : Employee): Bool {
     officemate != p
  }

  req boss.age > 30
  req this =  officemate.officemate
  req avoid(boss)
}
