(fn [& x]
  (let [ gcd (fn [a b] (if (zero? b) a (recur b (mod a b))))
         lcm (fn [a b] (/ (* a b) (gcd a b)))]
    (loop [m (first x)
           rst (rest x)]
      (if (empty? rst) m
        (recur (lcm m (first rst)) (rest rst))))))