(fn dp [m]
  (let [shit #(partition 2 (interleave (take (count %) (range)) %))]
    (loop [base (last m)
           rst (-> m reverse rest)]
      (if (empty? rst) (first base)
        (recur
          (map #(+ (last %) (min (nth base (first %)) (nth base (inc (first %))))) (shit (first rst)))
          (rest rst))))))