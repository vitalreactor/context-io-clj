(defproject zololabs/context-io "0.0.1"
  :description "Context.IO API wrapper for Clojure"
  :url "https://github.com/zololabs/context-io-clj"
  :plugins [[lein-multi "1.1.0"]]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.json "0.1.2"]
                 [clj-oauth "1.3.1-SNAPSHOT"]
                 [http.async.client "0.4.5"]]
  :dev-dependencies [[lein-autodoc "0.9.0"]]
  :autodoc {:name "context-io-clj"
            :description "Context.IO API wrapper for Clojure"})