(fn [x]
  (= (apply + (filter #(zero? (mod x %)) (range 1 (inc (/ x 2))))) x))