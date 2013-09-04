(fn count-e [x]
  (if (empty? x) 0
    (inc (count-e (rest x)))))