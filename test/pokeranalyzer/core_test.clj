(ns pokeranalyzer.core-test
  (:use clojure.test
        pokeranalyzer.core))

(deftest test-hand-comparator
  (testing "Card value"
    (is (= (values :king) (card-value [:spade :king]))))
  (testing "Highest card"
  	(is (= (values :king) (highest-card-value #{[:spade :king] [:hearts :ten]})))
  	)
  )