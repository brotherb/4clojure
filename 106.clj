(fn [b e]
  (loop [lst [[1 b]]]
    (let [lst (vec lst)
          head (first lst)
          step (first head)
          num (second head)]
      (if (= num e) step
        (if (even? num) (recur (rest (conj lst [(inc step) (* num 2)] [(inc step) (+ num 2)] [(inc step) (/ num 2)])))
            (recur (rest (conj lst [(inc step) (* num 2)] [(inc step) (+ num 2)]))))))))