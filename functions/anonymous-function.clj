((fn [msg] (println msg)) "hi")

(println
  ((fn [x] (* x x)) 5))
