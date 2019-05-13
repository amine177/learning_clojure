(def x -5)
(when (neg? x)
  (throw (RuntimeException. (str "x must be positive: " x))))
