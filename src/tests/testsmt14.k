
class A {
  RESULT_10 : Int

  b : Int

  fun id(x : Int) : Int {
    if x >= 0 then {
      k1 : Int = x - 1
      k1 + 1
    } else {
      k2 : Int = x + 1
      k2 - 1
    }
  }

  req RESULT_10 = id(10)
}

