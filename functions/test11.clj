(defn http-get [url]
  (slurp url))

(println (http-get "https://www.w3.org"))

