(ns test.test-runner
  (:require [cljs.test :refer [successful?] :refer-macros [run-tests]]
            [{{name}}.core-test]))

(enable-console-print!)

(defn runner [] 
  (tt/run-tests
    (tt/empty-env ::tt/default)
    '{{name}}.core-test))

(defn ^:export set-print-fn! [f]
  (set! cljs.core.*print-fn* f))

