(fn [v l]
  (apply assoc {}
    (interleave l (repeat (count l) v))))