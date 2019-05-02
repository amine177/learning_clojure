(def greet
  (fn []
     (println "Hello")))

(greet)


(def greet
  #(println "Hello"))

(greet)
