(fn [x]
  (let [is? (fn [a] (empty? (filter #(and (zero? (mod a %)) (zero? (mod x %))) (range 2 (inc a)))))]
    (count (filter is? (range 1 (inc x))))))