(fn [x]
  (loop [rst (reduce into x)]
    (if (empty? rst) true
      (if (> (count (filter #(contains? % (first rst)) x)) 1) false
        (recur (rest rst))))))