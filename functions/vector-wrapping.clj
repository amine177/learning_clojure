;; not good equivalent to (fn [x] ([x]))
#([%])

;; advisable
(println (#(vector %) 5))
