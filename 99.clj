(fn [a b]
  (map #(- (int %) 48) (str (* a b))))