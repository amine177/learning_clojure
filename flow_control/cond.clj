(let [x 5]
  (println
  (cond
        (< x 2) "x is less than 2"
        (< x 10) "x is less than 10")))

(let [x 15]
  (println
  (cond
        (< x 2) "x is less than 2"
        (< x 10) "x is less than 10"
        :else "x is greater or equal to 10")))
