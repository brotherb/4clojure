(fn [x]
  (apply conj {}
    (reduce into '()
      (for [lev1 x] (for [lev2 (second lev1)] [[(first lev1) (first lev2)] (second lev2)])))))