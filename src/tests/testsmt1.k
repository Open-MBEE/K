
class A {
  x : Int
  y : Int
  z : Int * Bool
  req z = Tuple(1,true)

  req z # 1 = 1 && z # 2

  fun f : Int * Bool {
    Tuple(1,true)
  }

  req x > 20

  req exists i : Int :-  i > 0 && x + i = y -- hence y > x

  req f() # 2
}

class B {
  sat : Bool
  z : Int
  a : A

  req a.x <= 22 -- so now a.x is 21 or 22

  req sat -- satisfied is true

  req !sat => (z = a.x) -- so z = a.x: 21 or 22

  fun g(l:Int):Int {
    l+1
  }

  fun f(k:Int):Int { -- adds 2 to its argument
    g(k) + 1
  }

  req f(z) <= 22 -- z + 2 <= 22
                 -- 23 <= 22 or 24 <= 22

  req a.x != a.y -- is is due to req 2 in A
}


---- A:
-- x > 20
-- y > x

---- B:
-- sat = true
-- a.x <= 22
-- z <= 20
-- a.x != a.y

