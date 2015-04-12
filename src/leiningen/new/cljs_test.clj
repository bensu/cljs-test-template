(ns leiningen.new.cljs-test
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cljs-test"))

(defn cljs-test 
  "Produces a Leiningen template to test ClojureScript apps."
  [name]
  (do
    (let [data {:name name
                :sanitized (name-to-path name)}]
      (main/info "Generating fresh 'lein new' cljs-test project.")
      (->files data
               ["project.clj" (render "project.clj" data)]
               ["src/{{sanitized}}/core.cljs" (render "core.cljs" data)]
               ["test/test_runner.cljs" (render "test_runner.cljs" data)]
               ["test/{{sanitized}}/core_test.cljs" 
                (render "core_test.cljs" data)]
               ["vendor/test/unit-test.html" (render "unit-test.html")]
               ["vendor/test/unit-test.js" (render "unit-test.js")]
               ["vendor/test/phantomjs-shims.js" (render "phantomjs-shims.js")]
               [".gitignore" (render "gitignore" data)]))))
