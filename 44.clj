(fn rotate-e
  [n x]
  (let [n (mod n (count x))
        part (split-at n x)]
    (into (first part) (reverse (last part)))))