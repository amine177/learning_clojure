(def cards '(10 :ace :jack 9))

(println "Cards:" cards)

(println
  "First element of cards:"
  (first cards))

(println
  "The rest of cards:"
         (rest cards))


(conj cards :queen)
(println
  "The size of cards is:"
  (count cards))
