(fn range-e [low high]
  (if (<= high low) '()
    (conj (range-e (inc low) high) low)))