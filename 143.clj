(fn dot-product
  [a b]
  (if (or (empty? a) (empty? b)) 0
    (+ (* (first a) (first b)) (dot-product (rest a) (rest b)))))