(fn re-iterate
  [f starter]
  (lazy-seq
    (cons starter
      (re-iterate f (f starter)))))