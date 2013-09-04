(fn [f & x]
  (loop [ret (apply f x)]
    (if (fn? ret) (recur (ret)) ret)))