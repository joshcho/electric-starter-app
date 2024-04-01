(ns electric-starter-app.main
  (:require [hyperfiddle.electric :as e]
            [hyperfiddle.electric-dom2 :as dom :refer [div text props style]]))

;; Saving this file will automatically recompile and update in your browser

(e/defn Main [ring-request]
  (e/client
   (binding [dom/node js/document.body]
     (dom/h1 (text "Hello from Electric Clojure"))
     (dom/p (text "Source code for this page is in ")
            (dom/code (text "src/electric_start_app/main.cljc")))
     (dom/p (text "Make sure you check the ")
            (dom/a (props {:href "https://electric.hyperfiddle.net/" :target "_blank"})
                   (dom/text "Electric Tutorial"))))))
