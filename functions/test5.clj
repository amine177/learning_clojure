(defn always-thing [& vars] (identity 100))

(println (always-thing 23 43 93))
