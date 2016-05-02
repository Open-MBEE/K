class A {
  x : Int = 1
}

class B extends A {
  y : Int = 2
}

-- D comes before C just for testing the type checker
class D extends C {
  i : Int = 3
}

class C extends B {
  z : Int = 4
}


dobj : D

RESULT_10 : Int = dobj.x + dobj.y + dobj.z + dobj.i
