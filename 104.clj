(fn wrn [x]
  (let [nums (loop [n x, result '()] (if (zero? n) result (recur (quot n 10) (conj result (mod n 10)))))
        bits (concat (repeat (- 4 (count nums))0) nums)
        th (fn [n] (apply str (repeat n \M)))
        hu (fn [n] (apply str (cond
                                (< n 4) (repeat n \C)
                                (= n 4) '(\C \D)
                                (= n 9) '(\C \M)
                                :else (conj (repeat (- n 5) \C) \D))))
        te (fn [n] (apply str (cond
                                (< n 4) (repeat n \X)
                                (= n 4) '(\X \L)
                                (= n 9) '(\X \C)
                                :else (conj (repeat (- n 5) \X) \L))))
        ge (fn [n] (apply str (cond
                                (< n 4) (repeat n \I)
                                (= n 4) '(\I \V)
                                (= n 9) '(\I \X)
                                :else (conj (repeat (- n 5) \I) \V))))]
    (apply str (concat (th (nth bits 0)) (hu (nth bits 1)) (te (nth bits 2)) (ge (nth bits 3))))))