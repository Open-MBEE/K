
class Sets {
  s1 : Set[Int] 

  req s1 = Set{x + 1 | x : Int :- 10 <= x && x <= 15} 

  req 
    Set{x | x : Int :- 11 <= x && x <= 14} 
      subset 
    Set{x + 1 | x : Int :- 10 <= x && x <= 15}


  req 11 isin Set{x + 1 | x : Int :- 10 <= x && x <= 15}
}

