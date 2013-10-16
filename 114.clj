(fn [n pre lst]
  (take-while #(not= %
                 (nth (filter pre lst) (dec n))
                 ) lst))