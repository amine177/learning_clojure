(def v [1 2 3])
(println "v:" v)
(println
  "v + [4 5]:"
  (conj v 4 5))
(println "v:" v)
