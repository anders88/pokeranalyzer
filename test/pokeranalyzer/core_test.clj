(ns pokeranalyzer.core-test
  (:use clojure.test
        pokeranalyzer.core))

(deftest test-hand-comparator
  (testing "Card value"
    (is (= (values :king) (card-value [:spade :king]))))
  (testing "Find Highest card"
  	(is (= (values :king) (highest-card-value #{[:spade :king] [:hearts :ten]})))
  	)
  (testing "Highest card"
  	(is (> (compare-hands #{[:spade :king]} #{[:space :ten]}) 0))
  	(is (< (compare-hands #{[:spade :king]} #{[:space :ace]}) 0))
  	(is (= (compare-hands #{[:spade :king] [:hearts :ace]} #{[:spades :ace] [:clubs :two]}) 0))
  	)
  
  )