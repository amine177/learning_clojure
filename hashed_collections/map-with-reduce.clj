(def players #{"A" "B" "C"})

(def myMap
  (reduce
        ;first argument to reduce is a tow parameter function
        ; m : the reduced collection, player is a value of iteration
        ; through the collection we want to reduce 'players'
        (fn [m player]
          ;associate a player and 0 as a key: val pair and add them
          ; to the reduced collection
          (assoc m player 0))

        ;second argument is the intial value of the reduced collection
        {}

        ;third argument is the collection to reduce
        players))

(println "keys:" (keys myMap))
(println "values:" (vals myMap))
(println "size:" (count myMap))
