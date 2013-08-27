(fn balance-n
  [n]
  (let [
        lst (map #(- (int %) (int \0)) (str n))
        len (count lst)
        half (quot len 2)
        flag (if (even? len) 0 1)]
    (= (apply + (take half lst)) (apply + (drop (+ half flag) lst)))))