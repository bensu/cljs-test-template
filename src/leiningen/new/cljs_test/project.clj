(defproject {{ name }} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2850"]]

  :plugins [[lein-cljsbuild "1.0.5"]]

  :source-paths ["src"]

  :cljsbuild {:builds [{:id "slimer"
                        :source-paths ["src" "test"]
                        :notify-command ["slimerjs"
                                         "vendor/test/unit-test.js"
                                         "vendor/test/unit-test.html"]
                        :compiler {:output-to "target/testable.js"
                                   :optimizations :whitespace
                                   :cache-analysis false
                                   :pretty-print true}}
                       {:id "phantom"
                        :source-paths ["src" "test"]
                        :notify-command ["phantomjs"
                                         "vendor/test/unit-test.js"
                                         "vendor/test/unit-test.html"]
                        :compiler {:output-to "target/testable.js"
                                   :optimizations :whitespace
                                   :cache-analysis false
                                   :pretty-print true}}]})
