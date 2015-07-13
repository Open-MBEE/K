
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

  result1 : Int = id(7)
  result2 : Int = id(-3)
  result  : Int = result1 + result2
  req result1 = 7
  req result2 = -3
  req result = 4
}