(fn map-e
  [f x]
  (if (empty? x) '()
    (lazy-seq (cons (f (first x)) (map-e f (rest x))))))