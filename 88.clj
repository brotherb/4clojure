(fn [a b]
  (set (filter #(not (and (a %) (b %))) (into a b))))