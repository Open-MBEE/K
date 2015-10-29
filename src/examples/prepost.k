==============================================
This example shows how one can specify function
specifications (pre and post conditions). These
are checked automatically by K. The example
shows that the specification is inherited by 
the MathUtil class when it extends the 
MathUtil_Spec class. 
==============================================

class MathUtil_Spec {
  fun min(x:Int,y:Int): Int
    post ($result  = x || $result  = y)
      && ($result <= x && $result <= y)

  fun abs(x:Int):Int
    post $result >= 0 && ($result = x || $result = -x)
}




class MathUtil extends MathUtil_Spec {
  fun min(x:Int,y:Int): Int {
    if x <= y then x else y
  }

  fun abs(x:Int):Int {
    if x < 0 then -x else x
  }
}
