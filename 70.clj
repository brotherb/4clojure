(fn [x]
  (sort #(compare
  	(clojure.string/lower-case %1)
  	(clojure.string/lower-case %2)) (re-seq #"\w+" x)))