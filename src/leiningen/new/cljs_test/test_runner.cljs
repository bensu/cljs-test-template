(ns test.test-runner
  (:require [cljs.test :as tt]
            [{{name}}.core-test]))

(enable-console-print!)

(defn runner [] 
  (tt/run-tests
    (tt/empty-env ::tt/default)
    '{{name}}.core-test))

(defn ^:export set-print-fn! [f]
  (set! cljs.core.*print-fn* f))

