
-- Test 8: --

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

==== MODEL: 

[
           1 -> (lift-Person (mk-Person 19)), 
           2 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!1), 
           3 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!6), 
           4 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!0), 
           5 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!5), 
           6 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!7), 
employee:  7 -> (lift-Employee (mk-Employee 57 8 9)), 
boss:      8 -> (lift-Person (mk-Person 31)), 
          10 -> (lift-Employee (mk-Employee 1267 12 13)), 
          12 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!4), 
          13 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!2), 
          14 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!3), 
          15 -> (lift-TopLevelDeclarations TopLevelDeclarations!val!8), 
officemate: else -> (lift-Employee (mk-Employee 7738 10 7))
]

===