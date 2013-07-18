(defproject zololabs/context-io-clj "0.1.1"
  :description "Context.IO API wrapper for Clojure"
  :url "https://github.com/zololabs/context-io-clj"
  
  :plugins [[lein-clojars "0.9.1"]
            [lein-sha-version "0.1.1"]]

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/data.json "0.1.2"]
                 [clj-oauth "1.4.0"]
                 [http.async.client "0.4.5"]
                 [zololabs/zolo-utils "0.1.0-SNAPSHOT"]]

  :profiles {:dev {:dependencies [[lein-autodoc "0.9.0"]]}
             :sha {:length 7}}

  :autodoc {:name "context-io-clj"
            :description "Context.IO API wrapper for Clojure"})