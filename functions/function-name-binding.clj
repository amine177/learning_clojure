(defn greeting [name] (str "Hello, " name))

;binding an anonymous function to a name
(def greetingBound (fn [name] (str "Hello, " name)))

(println (greeting "john"))
(println (greetingBound "john"))
