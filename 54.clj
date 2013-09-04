(fn partition-e
  [n x]
  (if (< (count x) n) '()
    (conj (partition-e n (drop n x)) (take n x))))