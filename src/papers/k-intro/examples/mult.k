class BankAccnt
class Car
class Person {
  mother : Person
  children : Set[Person]
  cars : Car [*]
  accnts : Set[BankAccnt] [1,*]
}