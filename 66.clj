(fn gcd
  [a b]
  (cond
    (zero? (mod a b)) b
    (< a b) (gcd b a)
    :else (gcd b (mod a b))))