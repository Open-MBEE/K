
-- This test case does still not work since blocks are not supported.

class A {
  fun id(x : Int) : Int {
    if x >= 0 then {
      k : Int = x - 1
      k + 1
    } else {
      k : Int = x + 1
      k - 1
    }
  }
}