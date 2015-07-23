class A {
  x : Int
  y : Int
}

class B extends A {
  z : Int
}

bobj : B

class C 

req (bobj as C).y = 4
