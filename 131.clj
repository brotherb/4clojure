(fn sum-subset
  [& x]
  (if (-> x count (= 1)) true
    (let [power-set
          (fn inner [x]
            (if (empty? x) #{#{}}
              (let [half (inner (rest x))]
                (into half (map #(conj % (first x)) half)))))
          not-empty? (fn [x] (not (empty? x)))
          nums (map set (map #(map (partial apply +) (filter not-empty? (power-set %))) x))]
        (not-empty? (reduce clojure.set/intersection nums)))))