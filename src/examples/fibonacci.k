package nasa.jpl.k.fibonacci

fun fib (n: Int) : Int {
    --match n with 
      --case 0 => 0
      --case 1 => 1
      --case x => fib(x) + fib(x-1)
    --end
}

req C_Fib : forall x : Int :- fib(x) > 0

fun helper (x:Int) : Int {
  req C0 : x > 0
  x + 1
}

fun swap (x:Int, y:Int) : (Int*Int) {
    val g : Int
    val t : Int = x
    x := y
    y := t
    Tuple(x,y)
}

-- return set of Int
fun f : Set[Int] {
  Set{1,2,3}
}
