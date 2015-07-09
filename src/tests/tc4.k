class A {
  fun foo(x : Int) : Int 
}

class B extends A { 
  fun foo(x : Int) : Int { x + 2 }
}