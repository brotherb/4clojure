(fn [x & rst]
  (loop [full rst
         result x]
    (if (empty? full) result
      (recur (drop 2 full) ((first full) result (second full))))))