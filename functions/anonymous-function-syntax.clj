;; a one argument anonymous function
;; (fn [x] (+ 6 x))
#(+ 6 %)

;; a tow argument fn
;; (fn [x y] (+ x y))
(#(+ %1 %2) 3 3)

;; variadic fn
;; (fn [x y & varargs] (println x y varargs))
(#(println %1 %2 %&) 3 4 6)
