(fn prime
  [n]
  (take n
  	(filter
  		(fn [x] (empty? (filter #(zero? (mod x %)) (range 2 x))))
  		(drop 2 (range)))))