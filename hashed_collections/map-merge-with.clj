(def new-scores {"Angela" 300 "Sam" 200})
(def scores {"Angela" 100 "Bob" 10 "Sam" 300})
(println
         (merge-with + scores new-scores))
