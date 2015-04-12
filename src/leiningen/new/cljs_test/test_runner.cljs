(ns test.test-runner
  (:require [cljs.test :refer [successful?] :refer-macros [run-tests]]
            [{{name}}.core-test]))

(enable-console-print!)

(defn runner []
  (if (successful? (run-tests '{{name}}.core-test))
    0
    1))
