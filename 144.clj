(fn [x & fs]
  ((fn gen [x fs]
     (lazy-seq
       (cons x (gen ((first fs) x) (concat (rest fs) (list (first fs)))))))
   x fs))