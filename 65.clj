(fn [x]
  (let [base (empty x)]
    (cond
      (= {} base) :map
      (= #{} base) :set
      :else (if (reversible? base) :vector :list))))