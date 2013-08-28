(fn reductions-e
  [f x & rst]
  (lazy-seq
    (if (nil? rst) (reductions-e f (first x) (rest x))
      (if (empty? (first rst)) [x]
        (cons x
          (reductions-e f (f x (first (first rst))) (rest (first rst))))))))