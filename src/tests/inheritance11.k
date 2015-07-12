
class A {
  a : Int
  b : Int
  c : Int
  d : Int
  e : Int
  f : Int
  g : Int

  req a + b + c + d + e + f + g = 90
}

class B extends A
class C extends B
class D extends C
class E extends D
class F extends E
class G extends F
class H extends G


objectA : A 

req objectA is H

