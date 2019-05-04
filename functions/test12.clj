(defn one-less-arg [f x]
  (fn [& args] (f x args)))

(apply (one-less-arg println 3) "hi" "hello")
