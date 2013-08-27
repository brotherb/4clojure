(fn digits
  [a b]
  (if (zero? a) [0]
    (loop [rst a
           result '()]
      (if (zero? rst) result
        (recur (quot rst b) (conj result (mod rst b)))))))