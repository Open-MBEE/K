
-- This example used to not solve due to linked list recursion: it
-- creates a chain of As. However, after the inheritance optimization
-- it now solves instantly.

class A {
  x : Int
  j : B
  req x > 0
  req j.yy > 10
}

class <b> B extends A {
  yy : Int
 
  -- req i.x > 10
  -- i : A -- does not solve with this line activated
}

b C {
  z : Int
  fun foo(x : Int) : Int {
    -- if true then x
    return x + 1
  }
}

bobj : C

req bobj.z = 1

y : Int

