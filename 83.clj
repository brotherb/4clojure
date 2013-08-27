(fn [& x]
  (let [truth (count (filter #(true? %) x))]
  	(not (or (zero? truth) (= truth (count x)))))) 