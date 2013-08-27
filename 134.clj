(fn [mkey mmap]
  (if-not (contains? mmap mkey) false
    (nil? (mkey mmap))))