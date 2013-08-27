(fn [x n]
  (apply list
    (map
      (fn [flag] (filter #(= (mod (.indexOf x %) n) flag) x))
      (range n))))