(ns pokeranalyzer.core)

(def suites [:spades :hearts :clubs :diamonds])
(def values {:two 2 :three 3 :four 4 :five 5 :six 6 :seven 7 :eight 8 :nine 9 :ten 10 :jack 11 :queen 12 :king 13 :ace 14})

(defn card-value [[suit value]]
	(values value)
	)

(defn highest-card-value [cards]
	(reduce max (map card-value cards))
	)

(defn compare-hands[a b]
	(compare (highest-card-value a) (highest-card-value b))
	)