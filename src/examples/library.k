package tutorial

fun size(set :Set[Loan]): Int
  
class Date  
  
class Library {
  name : String
  part books : Set[Book] 
  part loans : Set[Loan] 
  part members : Set[Member]
}
  
class Book {
  name : String
  copies : Int
  library : Library
    
  fun loans : Set[Loan] {
    Set{l | l : Loan :- l isin library.loans && l.book = this}
  }

  fun isAvailable : Bool {
    size(loans) < copies
  }

  req SufficientCopies:
    size(Set{l | l : Loan :- l isin library.loans && l.book = this}) <= copies
}
  
class Member {
  name : String
  library : Library
    
  fun loans : Set[Loan] {
    Set{l | l : Loan :- l isin library.loans && l.member = this}
  }

  fun books : Bag[Book] {
    Bag{l.book | l : Loan :- l isin loans}  
  }
  
  req AtMostTwoLoans: size(loans) <= 2
}
  
class Loan {
  book : Book
  member : Member
  Date : Date
}

