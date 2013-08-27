(fn [x]
  (reduce #(+ (* 2 %1) %2) (map #(- (int %) 48) x)))