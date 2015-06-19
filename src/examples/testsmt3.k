
-- Test 3: --

class A {
  x : Int = 1
  y : Int = 1

  fun sum: Int {
    x + y
  }

  req x < y
}

class B extends A {
  z : Int
  a1 : A
  a2 : A
  req a1.y < z
  req y < z
  -- req sum > 10
}

-- a : A = A(y :: 2)
-- b : B = B(a1 :: a)

