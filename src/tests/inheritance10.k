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
class H extends D


objectA : A 

req objectA is C

req objectA.a + objectA.b + objectA.c + objectA.d + objectA.e + objectA.f = 90

--  h : H 
--  req h.a + h.b + h.c + h.d + h.e + h.f + h.g = 90
--  req h.a + h.b + h.c + h.d + h.e= 90
