
class MathUtilSpec {

  fun min(x:Int,y:Int): Int
    post ($result  = x || $result  = y)
      && ($result <= x && $result <= y)

  fun abs(x:Int):Int
    post $result >= 0 && ($result = x || $result = -x)
}

class MathUtil extends MathUtilSpec {

  fun min(x:Int,y:Int): Int {
    if x <= y then x else y
  }

  fun abs(x:Int):Int {
    if x < 0 then -x else x
  }

}
