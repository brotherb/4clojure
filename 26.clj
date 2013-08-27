#(take % ((fn fibo 
            [a b]
            (lazy-seq
              (cons b (fibo b (+ a b))))) 
           0 1))