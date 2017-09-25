(defproject docker-demo "0.1.0"
  :description "Demo project for Dockerized Clojure API"
  :url "https://github.com/matiisi/docker-demo"
  :license {:name "The Unlicense"
            :url "https://unlicense.org"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [bidi "2.1.2"]
                 [yada "1.2.9"]]
  :main ^:skip-aot docker-demo
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
