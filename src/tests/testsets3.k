
annotation instances : Int

@instances(3)
class A {
  x : Int
}

@instances(1)
class B {
  s1 : Set[A]
  a1 : A
  a2 : A
  a3 : A

  req a1 != a2 && a2 != a3 && a1 != a3
  req s1 = Set{a1,a2}
  req a1 isin s1 
  req a3 !isin s1


  s2 : Set[A]
  
  req s2 = Set{a | a : A :- a.x = 10 && (a = a1 || a = a2)}
}

b : B

