(fn flat-e
  [x]
  (cond
    (not (sequential? x)) (list x)
    (empty? x) '()
    :else (concat (flat-e (first x)) (flat-e (rest x)))))