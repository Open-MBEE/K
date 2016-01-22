
class A {
 x : Int 

 req 0 < x
}

class B extends A {
  y : Int

  req x < y
}

class C {
  b1 : B
  b2 : B

  req b1 != b2
  req b1.x < b2.x
}

c : C