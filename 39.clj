(fn inter-e
  [x y]
  (loop [a x
         b y
         result '()]
    (cond
      (or (empty? a) (empty? b)) (reverse result)
      :else (recur
              (rest a)
              (rest b)
              (conj result (first a) (first b))))