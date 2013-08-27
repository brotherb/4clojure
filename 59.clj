(fn [& x]
  (fn [& y]
    (map #(apply % y) x)))