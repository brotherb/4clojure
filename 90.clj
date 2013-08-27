(fn cartesian
  [a b]
  (if (empty? a) #{}
    (into (cartesian (rest a) b) (map #(conj (-> a first vector) %) b))))