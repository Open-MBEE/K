
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

  RESULT_7 : Int = id(7)
  RESULT_m3 : Int = id(-3)
  RESULT_4  : Int = RESULT_7 + RESULT_m3
}