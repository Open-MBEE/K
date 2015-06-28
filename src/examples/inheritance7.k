
-- This does not solve due to linked list recursion: it
-- creates a chain of As.

class A {
  x : Int
  j : B
  req x > 0
  req j.yy > 10
}

class <b> B extends A {
  yy : Int
 
  -- req i.x > 10
  -- i : A 
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

fun foo(x : Int) : Int {
    -- if true then x
    return y
  }
