(ns docker-demo-test
  (:require [clojure.test :refer :all]
            [docker-demo :refer :all]))

(deftest a-test
  (testing "Working test"
    (is (= 1 1))))
