
class Sets {
  s1 : Set[Int]
  req r01: s1 = Set{1,2,3} 
  req r02: 1 isin s1       
  req r03: 4 !isin s1      
  req r04: s1 != Set{}     

  s2 : Set[Int]
  req r05: s2 = Set{}      
  req r06: s1 != s2        

  s3 : Set[Int]
  req r07: s3 = Set{3 .. 5}

  s4 : Set[Int] 
  req r08: s4 = s1 inter s3 
  req r09: s4 subset s1     
  req r10: s4 psubset s1    

  s5 : Set[Int]
  req r11: s5 = Set{x | x : Int :- 10 <= x && x <= 15}
  req r12: 10 isin s5 
  req r13: 9 !isin s5 
  req r14: Set{11 .. 13} subset s5 

  s6 : Set[Int] 
  req r15: s6 = Set{y | y : Int :- y isin s5 && y < 15}
  req r16: s6 psubset s5 
  req r17: s6 != s5 

  req r18: Set{x | x : Int :- x isin s5} = Set{y | y : Int :- 9 < y && y < 17 - 1} 
  req r19: Set{x | x : Int :- x isin s6} subset Set{y | y : Int :- y isin s5}
  req r20: Set{x | x : Int :- x isin s6} psubset Set{y | y : Int :- y isin s5}
  req r21: Set{x | x : Int :- x isin s6} != Set{y | y : Int :- y isin s5}
  req r22: 12 isin Set{y | y : Int :- y isin s5 && y < 15}
  req r23: 15 !isin Set{y | y : Int :- y isin s5 && y < 15}

  min : Int
  max : Int

  req r24: min = 9 && max = 14

  req r25: s5 = Set{min+1 .. max+1}

  s7 : Set[Bool]
  req r26: s7 = Set{x | x : Bool :- !x}
  req r27: false isin s7
  req r28: true !isin s7 

  s8 : Set[Set[Int]]

  req r29: Set{1,2,3} isin s8
}
