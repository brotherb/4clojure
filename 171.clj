(fn intervals [x]
  (let [x (set x)
        parts (fn left [s]
                (let [point (some #(if (not (contains? s %)) %) (range (first s) (+ 2 (last s))))
                      cut (partition-by #(> % point) s)]
                  (if (-> cut count (= 1)) cut
                    (conj (-> cut second set left) (-> cut first)))))]
    (if (empty? x) [] (apply vector (map #(vector (first %) (last %)) (parts x))))))