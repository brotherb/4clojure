(fn pron
  [x]
  (let [nxt (reduce into (map #(vector (count %) (first %)) (partition-by identity x)))]
    (lazy-seq
      (cons nxt (pron nxt)))))