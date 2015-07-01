
class A {
  a : Int = 1

  fun f(x : Int) : Int * Int {
    Tuple(a,x)
  }

  fun g (x : Int) : Int {
    k : Int * Int = f(x)
    k # 1 + k # 2 
  }
}

class B extends A {
  b : Int = 2
 
  fun h(tuple : Int * Int) : Int {
    k1 : Int = tuple # 1
    k2 : Int = tuple # 2
    g(k1 + k2)
  }

  r : Int = h(Tuple(10,20))

  req r = 31
}

