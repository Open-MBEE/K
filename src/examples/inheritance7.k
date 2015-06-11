class A {
  x : Int
  j : B
  req x > 0
  req j.y > 10
}

class <b> B extends A {
  y : Int
  i : A
  req i.x > 10
}

b C {
  z : Int
}

bobj : C

req bobj.z = 1
