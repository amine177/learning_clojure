(defn greeting
  ([] (println "Hello, World!"))
  ([x] (println "Hello" x))
  ([x y] (println x y)))

(greeting)
(greeting "cute user")
(greeting "beautiful" "person")
