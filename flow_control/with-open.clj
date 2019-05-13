(with-open [f (clojure.java.io/writer "/tmp/new")]
  (.write f "testing writing in files"))
