class A {
  a : Int
  b : Int
  c : Int
  d : Int
  e : Int
  f : Int
  g : Int
}

class B extends A
class C extends B
class D extends C
class E extends D
class F extends E
class G extends F
class H extends G

-- h : A
-- req h is H

h : H = H()
req h.a + h.b + h.c + h.d + h.e + h.f + h.g = 90
