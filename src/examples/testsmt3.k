
-- Test 3: --

class A {
  x : Int = 1
  y : Int

  fun sum: Int {
    x + y
  }

  req x < y
}

class B extends A {
  z : Int
  a1 : A
  a2 : A
  a3 : A = A(y :: 17) 
  a4 : A = if z > 3 then A(y :: z) else A(y :: 33)
  req a1.y < z
  req y < z
  req sum > 10
}

inst1A : A = A(x :: 1,y :: 2) 
inst2A : A = A(y :: 2) 

inst1B : B = B(a2 :: inst1A, z :: 3) 
