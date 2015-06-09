class A {
  x : Int
  req x > 10
}

class B extends A {
  y : Int
  req y > 10 && y < 20
  req x < 20
}

class C extends B {
  z : Int
  req z = 4 && x < 15
}