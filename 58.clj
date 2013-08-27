(fn comp-e [& x]
  (let [order (reverse x)]
    (fn inner [y & y-rst]
      (loop [result (apply (first order) y y-rst)
             r-order (rest order)]
        (if (empty? r-order) result
          (recur ((first r-order) result) (rest r-order)))))))