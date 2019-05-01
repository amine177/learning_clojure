(defn messenger
  ; zero arguments arity
  ([] (messenger "Hello world!"))

  ; one argument arity
  ([msg] (println msg)))


(messenger)
(messenger "one argument given")
