(def company
  {:name "WidgetCo"
   :address {:street "123 Main st"
             :city "Springfield"
             :state "IL"}})

; accessing a field at the second level of nesting
(println (get-in company [:address :city]))
