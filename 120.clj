(fn [x]
  (count (filter
           #(< %
              (apply + (map (fn [x] (* (- (int x) 48) (- (int x) 48))) (str %))))
           x)))