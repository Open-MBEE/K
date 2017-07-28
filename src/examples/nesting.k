package nesting

class Outer {
  var x : Int
  
  class Inner {
    var y : Int
    
    req x = y
    
    class Very_Inner {
      var z : Int
      
      req z = x
    }
  }
}