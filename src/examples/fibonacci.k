package nasa.jpl.k.fibonacci

fun fib (n) : Int {
    match n with 
      case 0 => 0
      case 1 => 1
      case x => fib(x) + fib(x-1)
    end
};

req C_Fib : forall x : Int . fib(x) > 0;

fun helper (x:Int) : Int {
  req C0 : x > 0;
  x + 1
};

fun swap (x, y) : Int*Int 
post $#1 = y && $#2 = x
{
    val g;
    val t = x;
    x = y;
    y = t;
    (x,y)
};

-- unit
fun f(x) = 1 ;

fun f(x) : Int = 1;

-- return set of Int
fun f() : {Int} {
  {1,2,3}
};

fun f() : {Int} = {1,2,3};

fun f() = {1,2,3};

fun f() {
  {1,2,3}
};

fun f(x) {

  while (x < 0) do
    x := x + 1
  end;

  if x > 0 then x+1 end;

  if x > 0 then x+1 else x-1 end
};

fun g() = 

if x > 1 then x := x + 5 end;

y := y+z;

(x,y);

val 1;