(println "is true true?"
         (if true :truthy :falsey))

(println "is Object. true?"
         (if (Object.) :truthy :falsey))

(println "is 0 true?"
         (if 0 :truthy :falsey))

(println "is false true?"
         (if false :truthy :falsey))
(println "is nil true?"
         (if nil :truth :falsey))
