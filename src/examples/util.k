package util

========================================
A utility class that shows various 
functions being implemented using K. 
========================================

class Util {

  fun binarySearch (l : Seq[Int], x:Int) : (Bool*Int) 
    pre forall i : Int . 
          forall j : Int .
            i >= 0 && j >= 0 && 
            i < l.size() && 
            j > i && j < l.size() => l.at(i) < l.at(j)
    post $result # 1 = true => x isin l
  {
    mid : Int = l.size()/2

    if l.size() = 0 then return false

    if l.at(mid) = x then {
      println("I found it!")
      return Tuple(true, x.toString())
    }
    else {
      if l.at(mid) < x then 
        return binarySearch(l.subList(mid+1, l.size()), x)
      else 
        return binarySearch(l.subList(0, mid-1), x)
    }
  }
}

class ModelElement{

}

class <view> View extends ModelElement {

}


view MyView { 

}

view MyView2 {

}

