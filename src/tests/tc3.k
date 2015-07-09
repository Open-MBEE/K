-- should not type check
class A {
  fun foo(x : Int) : Int { x + 1 } 
}

class B extends A { 
  fun foo(x : Int) : Int { x + 2 }
}