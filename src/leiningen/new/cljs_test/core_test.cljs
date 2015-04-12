(ns {{name}}.core-test
    (:require [cljs.test :refer-macros [deftest async testing is use-fixtures]]
              [{{name}}.core :as core]))

(enable-console-print!)

(deftest adder
  (testing "Does the adder add?"
    (is (= 5 (core/adder 2 3))))
  (testing "and the not-adder?"
    (is (not (= 5 (core/not-adder 2 3))))))
