
==========
Hiearchy:
 A
   B
   C
     D
==========

class A {
  a : Int = 1
}

class B extends A {
  b : Int = 2
}

-- D comes before C just for testing the type checker
class D extends C {
  d : Int = 4
}

class C extends A {
  c : Int = 3
}

dobj : D

sum : Int = dobj.a + dobj.c + dobj.d

