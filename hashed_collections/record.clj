(defrecord Person [first-name last-name age occupation])

; construct a Person instance using arguments in respective position
(def kelly (->Person "Kelly" "Keen" 32 "Programmer"))
(println kelly)
; construct a Person instance using a map
(def kelly (map->Person
                        {:first-name "Kelly"
                         :last-name "keen"
                         :age 32
                         :occupation "Programmer"}))
(println kelly)
