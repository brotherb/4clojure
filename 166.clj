(fn [op a b]
  (cond
    (op a b) :lt
    (op b a) :gt
    :else :eq))