(fn balanced-prime?
  [n]
  (let [prime? (fn [x] (= (count (filter #(zero? (mod x %)) (range 2 x))) 0))
        pre-prim (fn inner-pre [x] (if (prime? x) x (inner-pre (dec x))))
        next-prim (fn inner-next [x] (if (prime? x) x (inner-next (inc x))))]
    (and
      (> n 2)
      (prime? n)
      (= n (/ (+ (pre-prim (dec n)) (next-prim (inc n))) 2)))))