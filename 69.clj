(fn [f & x]
  (let [K (reduce into #{} (map keys x))
        not-nil (fn [v] (not (nil? v)))]
    (apply conj {}
      (map
        #(vector % (let [args (filter not-nil (map (fn [m] (m %)) x))]
                     (if (= (count args) 1) (first args) (apply f args))))
        K))))