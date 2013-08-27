(fn [& x]
  (reduce #(if (> %1 %2) %1 %2) x))