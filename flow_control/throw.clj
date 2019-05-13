(try
     (throw (Exception. "my custom exception"))
     (catch Exception e (prn (.getMessage e))))
