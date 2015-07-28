
class A {
  a : Int = 1

  fun f(x : Int): Int
    pre a != 1
}

class B extends A {
  b : Int = 2

  fun f(x: Int): Int
    pre a >= 0
    pre x > a
    post $result >= 0
}

class C extends B {
  c : Int = 3

  fun f(x:Int): Int 
    pre b >= 0
    pre c >= 0
    post $result > 0
 {
    a + b + c + x
  }
}

c : C

result : Int = c.f(10)

req result = 16

