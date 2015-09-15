class Stock
class Car
class Person {
  mother : Person
  children : Set[Person]
  cars : Car [*]
  prtflios : Set[Stock] [1,*]
}