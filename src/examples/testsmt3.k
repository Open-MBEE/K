
-- Test 3: --

class A {
  x : Int = 1
  y : Int

  req x < y
}

class B {
  z : Int
  a1 : A
  a2 : A
  req a1.y < z
}

-- a : A = A(y :: 2)
-- b : B = B(a1 :: a)
