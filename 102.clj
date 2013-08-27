(fn [x]
  (clojure.string/replace x #"-\w" #(clojure.string/upper-case (second %1))))