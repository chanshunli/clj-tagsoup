(ns pl.danieljanus.tagsoup-test
  (:use
   pl.danieljanus.tagsoup
   clojure.test))

(deftest parse-string-test
  (is (= [:html {} [:body {} [:p {} "foo"]]]
        (parse-string "<p>foo</p>")
        ;; => [:html {} [:body {} [:p {} "foo"]]]
        ))

  (clojure.pprint/pprint
    (parse "http://example.com"))
  ;; =>
  [:html
   {}
   [:head
    {}
    [:title {} "Example Domain"]
    [:meta {:charset "utf-8"}]
    [:meta
     {:http-equiv "Content-type", :content "text/html; charset=utf-8"}]
    [:meta
     {:name "viewport", :content "width=device-width, initial-scale=1"}]
    [:style
     {:type "text/css"}
     "\n    body {\n        background-color: #f0f0f2;\n        margin: 0;\n        padding: 0;\n        font-family: -apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", \"Open Sans\", \"Helvetica Neue\", Helvetica, Arial, sans-serif;\n        \n    }\n    div {\n        width: 600px;\n        margin: 5em auto;\n        padding: 2em;\n        background-color: #fdfdff;\n        border-radius: 0.5em;\n        box-shadow: 2px 3px 7px 2px rgba(0,0,0,0.02);\n    }\n    a:link, a:visited {\n        color: #38488f;\n        text-decoration: none;\n    }\n    @media (max-width: 700px) {\n        div {\n            margin: 0 auto;\n            width: auto;\n        }\n    }\n    "]]
   [:body
    {}
    [:div
     {}
     [:h1 {} "Example Domain"]
     [:p
      {}
      "This domain is for use in illustrative examples in documents. You may use this\n    domain in literature without prior coordination or asking for permission."]
     [:p
      {}
      [:a
       {:shape "rect", :href "https://www.iana.org/domains/example"}
       "More information..."]]]]]


  )
