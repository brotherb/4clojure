(fn flat-e
  [x]
  (let [level1? (fn [x] (zero? (count (filter #(sequential? %) x))))]
    (cond
      (empty? x) '()
      (level1? x) (list x)
      :else (concat (flat-e (first x)) (flat-e (rest x))))))