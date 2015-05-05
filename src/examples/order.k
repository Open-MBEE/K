package examples.order

class <event> Event {
  t : Real
}

event A
event B
event C

A1 : A
A2 : A
A3 : A
C1 : C
C2 : C
C3 : C
B1 : B
B2 : B
B3 : B

class Scheduler {
  
  req A1.t > 0 && A2.t > 0  && A3.t > 0  && 
      B1.t > 0 && B2.t > 0  && B3.t > 0  && 
      C1.t > 0 && C2.t > 0  && C3.t > 0 
      
  req A1.t != B1.t && A1.t != B2.t
  req A3.t != B2.t
  
  req A1B2C2: A1.t < B2.t && B2.t < C2.t
  req B3A3: B3.t < A3.t
  req C2A4: C2.t < A4.t
  req B3A3: A3.t > B3.t
  req C3A3B3: C3.t > A3.t && C3.t > B3.t
  
}