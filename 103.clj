(fn [n x]
  (let [power-set
          (fn inner [x]
            (if (empty? x) #{#{}}
              (let [half (inner (rest x))]
                (into half (map #(conj % (first x)) half)))))]
    (set (filter #(-> % count (= n)) (power-set x)))))