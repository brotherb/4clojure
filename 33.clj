(fn [x n]
  (reduce into (map #(repeat n %) (reverse x))))