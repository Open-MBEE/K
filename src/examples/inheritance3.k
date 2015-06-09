class A {
  x : Int
  fun get : Int { x } 
}

class B extends A {
  y : Int
  fun sum(k : Int) : Int {
    x + y + k
  }
}


bobj : B

bobj.sum(bobj.get())