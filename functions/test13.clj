(defn tow-fns [f g]
  (fn [x] (f (g x))))

(println ((tow-fns not not)  true))
