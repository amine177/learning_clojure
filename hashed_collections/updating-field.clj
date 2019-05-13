(def players
  (zipmap
    #{:Alice :Bob :Kelly}
    (repeat (.nextLong (java.util.Random. 100)))))
(println players)
(println (assoc players :Alice 305))
