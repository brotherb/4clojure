(fn deni
  [x n]
  (if (empty? x) '()
    (concat (take (dec n) x) (deni (drop n x) n))))

or

(fn [x n]
  (filter #(not (zero? (mod (inc (.indexOf x %)) n))) x))