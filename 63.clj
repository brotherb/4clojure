(fn group-by-e
  [f x]
  (if (empty? x) {}
    (let [v (f (first x))
          this (filter #(= (f %) v) x)
          that (filter #(not= (f %) v) x)]
      (conj (group-by-e f that) (vector v this)))))