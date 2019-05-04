(defn triplicate [f & args]
  (f args)
  (f args)
  (f args))


(triplicate println 1 3 "Hi")
