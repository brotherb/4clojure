(fn rotate-e
  [n x]
  (let [n (mod n (count x))
        part (split-at n x)]
    (concat (last part) (first part))))