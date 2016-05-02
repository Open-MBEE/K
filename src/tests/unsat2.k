class A {

  x : Int
  z : Int
  
  req AxGT0: x > 0
  
  req z = 10

  req z + x = 111
}

class B {
  y : Int

  req y < 0
}

class C extends A, B {

  req x < 0
  
}