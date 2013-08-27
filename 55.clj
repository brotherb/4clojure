(fn [x]
  (apply conj {} (map #(vector (first %) (count (second %))) (group-by identity x))))