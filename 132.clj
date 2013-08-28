(fn insert-e [f item x]
  (lazy-seq
    (if (empty? x) '()
      (if (-> x second nil?) x
        (if (f (first x) (second x))
	        (conj (insert-e f item (rest x)) item (first x))
	        (cons (first x) (insert-e f item (rest x))))))))