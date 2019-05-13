(def players #{"A" "B" "C"})
(def playersMap (into {} (map (fn [player] [player 0]) players)))
(println playersMap)
