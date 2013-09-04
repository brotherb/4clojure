#(take % ((fn fibo 
            [a b]
            (lazy-seq
              (cons b (fibo b (+ a b))))) 
           0 1))

or

#(take % (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1])))