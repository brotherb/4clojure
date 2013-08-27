(fn power-set
  [x]
  (if (empty? x) #{#{}}
    (let [half (power-set (rest x))]
      (into half (map #(conj % (first x)) half)))))