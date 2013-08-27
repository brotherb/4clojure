(fn flat-e
  [x]
  (cond
    (not (sequential? x)) (list x)
    (empty? x) '()
    :else (into (flat-e (rest x)) (reverse (flat-e (first x))))))