(fn deni
  [x n]
  (if (empty? x) '()
    (into (deni (drop n x) n) (reverse (take (dec n) x)))))

or

(fn [x n]
  (filter #(not (zero? (mod (inc (.indexOf x %)) n))) x))