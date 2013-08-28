(fn symmetry? [x]
  (let [left (fn [x] (nth x 1))
       right (fn [x] (nth x 2))
       tree? (fn istree? [x]
               (if (nil? x) true
                  (if-not (sequential? x) false
                    (if-not (= (count x) 3) false
                      (and (istree? (left x)) (istree? (right x)) )))))
       mirror? (fn ismirror? [a b]
                 (cond (and (nil? a) (= a b)) true
                   (and (not (or (nil? a) (nil? b))) (= (first a) (first b))) (and (ismirror? (left a) (right b)) (ismirror? (right a) (left b)))
                   :else false))]
    (and (tree? x) (mirror? (left x) (right x)))))