(fn tic-tac [bd]
  (let [pos (fn [x y] (-> bd (nth x) (nth y)))
        won? (fn [x]
               (or
                 (or (= x (pos 0 0) (pos 0 1) (pos 0 2)) (= x (pos 1 0) (pos 1 1) (pos 1 2)) (= x (pos 2 0) (pos 2 1) (pos 2 2)))
                 (or (= x (pos 0 0) (pos 1 0) (pos 2 0)) (= x (pos 0 1) (pos 1 1) (pos 2 1)) (= x (pos 0 2) (pos 1 2) (pos 2 2)))
                 (or (= x (pos 0 0) (pos 1 1) (pos 2 2)) (= x (pos 0 2) (pos 1 1) (pos 2 0)))))]
    (cond
      (won? :x) :x
      (won? :o) :o
      :else nil)))