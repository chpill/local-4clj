(def project 'local-4clj)
(def version "0.1.0-SNAPSHOT")

(set-env! :dependencies   '[[org.clojure/clojure "RELEASE"]
                            [nightlight "1.6.5"]])

(require '[nightlight.boot :refer [nightlight]])
