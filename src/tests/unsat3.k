fun foo(x : Int) : Int
  pre x > 0
  post $result > 0
  --post $result < 0
{
  -1
}