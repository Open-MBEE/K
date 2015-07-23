class A {
  x : Int
  y : Int
}

class B extends A {
  z : Int
}

bobj : B

class C {
  t : Int
}

req (bobj as C).t = 4
