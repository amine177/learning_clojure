(defn messenger-builder [msg]
  (fn [who]
    (println msg who)))


(def hello-er
  (messenger-builder "Hello"))

(hello-er "mr cute person")
