(fn [f]
  (fn [& x] (reduce #(%1 %2) f x)))