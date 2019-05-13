(def company
    {:name "WidgetCo"
     :address {:street "123 Main St"
               :city "Springfield"
               :state "IL"}})


(println (assoc-in company [:address :city] "updated addr"))
