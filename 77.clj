(fn Anagram
  [x]
  (let [ is? (fn [a] (= (sort (apply list a)) (sort (apply list (first x)))))
         chosen (into #{} (filter is? x))
         rst (filter #(not (is? %)) x)]
    (if (empty? x) #{}
      (if (= (count chosen) 1) (Anagram rst)
        (conj (Anagram rst) chosen)))))