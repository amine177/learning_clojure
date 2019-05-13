(def scores {"Fred" 1400
             "Bob"  1240
             "Angela" 1024})


(println (get scores "Angela"))
(println (assoc scores "Sally" 5))
(println scores)
(println (dissoc scores "Bob"))
