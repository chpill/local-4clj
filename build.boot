(def project 'local-4clj)
(def version "0.1.0-SNAPSHOT")

(set-env! :dependencies   '[[org.clojure/clojure "RELEASE"]
                            [nightlight "1.6.4" :scope "test"]])

(require '[nightlight.boot :refer [nightlight]])

(deftask dev []
  (comp (wait) (repl :server true) (nightlight :port 4000)))

(deftask deps []
  (comp (repl :server true) (nightlight :port 4000)))
