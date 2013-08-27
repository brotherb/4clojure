(fn Pascal-Triangle
  [x]
  (map (fn [a] (if (zero? a) 1 (/ (apply * (take a (reverse (range 1 x)))) (apply * (take a (range 1 x)))))) (range x)))