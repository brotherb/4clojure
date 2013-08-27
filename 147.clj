(fn pasical
  [x]
  (let [nxt (fn inner [y]
                 (if (= (count y) 1) []
                   (conj (inner (rest y)) (+ (bigint (first y)) (second y)))))]
    (cons x (lazy-seq (pasical (nxt (into (into [0] (reverse x)) [0])))))))