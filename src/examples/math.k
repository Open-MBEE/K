package examples.math



class Math {

  fun integrate(lower:Real, upper:Real, f: Real -> Real, samples:Int)

  fun integrate(lower:Real, upper:Real, f: Real -> Real) { 
    integrate(lower, upper, f, 1000)
  }

  -- derivative? 


}