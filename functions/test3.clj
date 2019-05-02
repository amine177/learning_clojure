(defn greeting
  ([] "Hello, world!")
  ([x] (str "Hello "  x))
  ([x y] (str x y)))

(println (greeting))
(println (greeting "cute user"))
(println (greeting "beautiful" "person"))

(assert (= "Hello, world!" (greeting)))
(assert (= "Hello Clojure!" (greeting "Clojure!")))
(assert (= "Good morning Clojure!" (greeting "Good morning " "Clojure!")))
