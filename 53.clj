(fn LI-subseq [x]
  (loop [current (vector (first x))
         rst (rest x)
         longest current]
    (if (empty? rst)
      (do (prn current longest)
        (if (> (count current) (count longest)) current
          (if (>= (count longest) 2) longest [])))
      (if (< (last current) (first rst)) (recur (conj current (first rst)) (rest rst) longest)
        (do (prn current longest)
          (recur (vector (first rst)) (rest rst) (if (> (count current) (count longest)) current longest)))))))