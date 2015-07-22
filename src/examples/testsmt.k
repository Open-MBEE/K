
class MathUtil {

  fun min(x:Int,y:Int): Int 
    post ($result  = x || $result  = y) 
      && ($result <= x && $result <= y)
  {
    if x <= y then x else y
  }


  fun abs(x:Int):Int 
    post $result >= 0 && ($result = x || $result = -x)
  {
    if x < 0 then -x else x
  }

}

