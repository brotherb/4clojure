(fn [f x]
  (let [m (apply conj {} (map #(vector % (f %)) x))]
    (set (map #(set (filter (fn [x] (= % (m x))) (keys m))) (vals m)))))