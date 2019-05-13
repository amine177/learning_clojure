(loop [i 0]
  (println i)
  (if (< i 10)
    (recur (inc i))
    i))
