
class A {
  x : Int

  req x > 0
}

class B extends A {
  y : Int

  a : A

  req y = x + 1
}