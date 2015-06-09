
class A {
  fun f(x:Int):Int {
    x + 1
  }
}

class B {
  a1 : A
  a2 : A
  a3 : A

  req a1 != a2
  req a2 != a3
}
