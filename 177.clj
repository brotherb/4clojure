(fn [x]
  (let [mat {\} {\{ true}, \) {\( true}, \] {\[ true}}
        bracket? #{\( \) \{ \} \[ \]}
        rightbracket? #{\{ \[ \(}]
    (loop [rst x
           stack '()]
      (if (empty? rst) (empty? stack)
        (if-not (bracket? (first rst))
          (recur (rest rst) stack)
          (if (rightbracket? (first rst))
            (recur (rest rst) (conj stack (first rst)))
            (if ((mat (first rst)) (first stack))
              (recur (rest rst) (rest stack))
              false)))))))