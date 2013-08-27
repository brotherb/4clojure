(fn [x]
	(clojure.string/join ","
		(filter
			(fn [n] 
				(not (empty?
					(filter #(= (* % %) n) (range (inc n))))))
			(map #(Integer. %) (clojure.string/split x #",")))))