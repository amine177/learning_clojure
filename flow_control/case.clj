(defn foo [x]
  (case x
    5 "x is 5"
    10 "x is 10"))

(println (foo 10) "\n*********************\n")
(println (foo 11))
