s0 : Set[Int] = Set{}

s1 : Set[Int] = Set{1, 2, 3}

s2 : Set[Bool] = Set{true, false, true}

s3 : Set[Int] = Set{1 .. 5}

s4 : Set[Int] = Set{x | x : Int :- x < 10}

s5 : Set[Int]

req s1 isin s4

req s5 = s0 union s1

req s1 subset s4

req s1 psubset s4

req s1 = s1 inter s4

