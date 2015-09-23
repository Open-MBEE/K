p : Bool
q : Bool
r : Bool
s : Bool

req (p || q)
req (r => s)
req (s => (q <=> r))
req (p || r)
req (r || s)
req !(r && q)
req !(s && p)
