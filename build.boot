(def project 'local-4clj)
(def version "0.1.0-SNAPSHOT")

(set-env! :dependencies   '[[org.clojure/clojure "1.9.0-alpha17"]
                            [nightlight "1.6.5" :exclusions [org.clojure/clojure]]])

(require '[nightlight.boot :refer [nightlight]])
