(defn triplicate [f]
  (f))

(defn triplicate2 [f & args]
  (triplicate (fn [] (apply f args))))
(defn print-hi []
  (println "hi"))
(triplicate print-hi)
(triplicate2 println 2 3 "hello")
