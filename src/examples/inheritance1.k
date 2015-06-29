D
class A {
  x : Int
}

class B extends A {
  y : Int
}

-- D comes before C just for testing the type checker
class D extends C {
  i : Int
}

class C extends B {
  z : Int
}


dobj : D

sum : Int = dobj.x + dobj.y + dobj.z + dobj.i

