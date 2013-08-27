(fn istree?
  [x]
  (if (nil? x) true
    (if-not (sequential? x) false
      (if-not (= (count x) 3) false
        (and (istree? (nth x 1)) (istree? (nth x 2)))))))