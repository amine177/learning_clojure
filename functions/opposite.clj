(defn opposite [f]
  (fn [& args] (not (f args))))

(println ((opposite not) true))
