
-- This one fails due to type checker issue: inner bobj.get(). Reported as bug.

class A {
  x : Int = 2

  fun get : Int { x } 
}

class B extends A {
  y : Int = 5

  fun sum(k : Int) : Int {
    get() + y + k
  }
}


bobj : B

theSum : Int = bobj.sum(bobj.get())

req  theSum = 9 