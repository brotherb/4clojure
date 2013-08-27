(fn happynumber?
  [n]
  (loop [base n
         results #{}]
    (let [sum ((fn cal [x] (if (< x 10) (* x x) (+ (* (rem x 10) (rem x 10)) (cal (quot x 10))))) base)]
    	(cond
        (results sum) false
        (= 1 sum) true
        :else (recur sum (conj results sum))))))