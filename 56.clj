(fn distinct-e
  [x]
  (if (empty? x) '()
    (conj (distinct-e (filter #(not= % (first x)) (rest x))) (first x))))