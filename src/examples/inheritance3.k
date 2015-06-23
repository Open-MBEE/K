
class A {
  x : Int = 2

  fun get : Int { x } 
}

class B extends A {
  y : Int = 5

  fun sum(k : Int) : Int {
    y + k
  }
}


bobj : B

req bobj.sum(bobj.get()) = 7 