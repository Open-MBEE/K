
-- Does not type check.

class A {
  a : Int

  req a = 
    { k1 : Int = 1
      k1
    } 
    + 
    { k2 : Int = 2
      k3 : Int = 3
      k2 + k3}
}