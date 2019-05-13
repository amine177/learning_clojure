(try
     (/ 2 1)
     (catch ArithmeticException e
       "divide by zero")
     (finally
              (println "cleanup")))
