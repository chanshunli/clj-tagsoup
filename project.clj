(defproject steve-clj-tagsoup "0.4.3"
  :description "A HTML parser for Clojure."
  :deploy-repositories [["releases" :clojars]
                       ["snapshots" :clojars]]
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.xml "0.0.8"]
                 [org.ccil.cowan.tagsoup/tagsoup "1.2.1"]
                 [net.java.dev.stax-utils/stax-utils "20070216"]])
