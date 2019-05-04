(assert (= (Math/cos Math/PI) -1.0))
(let [x (rand-int Integer/MAX_VALUE)]
  (assert (= (+ (Math/pow (Math/sin x) 2) (Math/pow (Math/cos x) 2)))))
