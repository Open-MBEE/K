class A {
  x : Int
 
  req x > 10 
}

class B {
  a : A
  
  req a.x < 1
}