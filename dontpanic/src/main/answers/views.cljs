(ns answers.views
  (:require [answers.state :refer [app-state]]
            [answers.events :refer [increment decrement]]))

(defn header
  []
  [:div
   [:h1 "Don't Panic!"]
   [:h2 {:class "classy-class"}
    "Rule #2"]
   [:div {:style {:border "7px solid indigo"}}
    [:h3 "Dont forget to bring a towel!"]]
   [:img
    {:src "https://i.pinimg.com/originals/41/e0/d1/41e0d1c13f52ac031320109153ede52a.jpg"}]])

(defn counter
  []
  [:div
   [:button.btn {:on-click #(decrement %)} "-"]
   [:button {:disabled true} (get @app-state :count)]
   [:button.btn {:on-click #(increment %)} "+"]])

(defn app []
  [:div
   [header]
   [counter]])
