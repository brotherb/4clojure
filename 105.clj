(fn k-v [x]
  (loop [rst x
         current-key nil
         result {}]
    (if (empty? rst) result
      (if (-> rst first class (= clojure.lang.Keyword)) (recur (rest rst) (first rst) (assoc result (first rst) []))
        (recur (rest rst) current-key (assoc result current-key (conj (result current-key) (first rst))))))))