(def person
  {:first-name "Kelly"
   :last-name "Bron"
   :age 32
   :occupation "Programmer"})
(println (get person :occupation))
(println (get person :age))
(println (:occupation person))
(println (:nonExistantKeyworName person "default-value"))
