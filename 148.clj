(fn big-devide
  [n a b]
  (let [n (bigint n)
        n1 (quot (dec n) a)
        n2 (quot (dec n) b)
        n3 (quot (dec n) (* a b))]
    (-
      (+
        (/ (* a n1 (inc n1)) 2)
        (/ (* b n2 (inc n2)) 2))
      (/ (* (* a b) n3 (inc n3)) 2))))