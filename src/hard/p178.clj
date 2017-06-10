(ns hard.p178)

;; BEST HAND

;; Difficulty: Hard
;; Topics: strings game

;; Following on from http://www.4clojure.com/problem/128, determine the best poker hand that can be made with five cards. The hand rankings are listed below for your convenience.
;;   Straight flush: All cards in the same suit, and in sequence
;;   Four of a kind: Four of the cards have the same rank
;;   Full House: Three cards of one rank, the other two of another rank
;;   Flush: All cards in the same suit
;;   Straight: All cards in sequence (aces can be high or low, but not both at once)
;;   Three of a kind: Three of the cards have the same rank
;;   Two pair: Two pairs of cards have the same rank
;;   Pair: Two cards have the same rank
;;   High card: None of the above conditions are met

(def __ ;; Your solution here!

  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= :high-card (__ ["HA" "D2" "H3" "C9" "DJ"]))
(= :pair (__ ["HA" "HQ" "SJ" "DA" "HT"]))
(= :two-pair (__ ["HA" "DA" "HQ" "SQ" "HT"]))
(= :three-of-a-kind (__ ["HA" "DA" "CA" "HJ" "HT"]))
(= :straight (__ ["HA" "DK" "HQ" "HJ" "HT"]))
(= :straight (__ ["HA" "H2" "S3" "D4" "C5"]))
(= :flush (__ ["HA" "HK" "H2" "H4" "HT"]))
(= :full-house (__ ["HA" "DA" "CA" "HJ" "DJ"]))
(= :four-of-a-kind (__ ["HA" "DA" "CA" "SA" "DJ"]))
(= :straight-flush (__ ["HA" "HK" "HQ" "HJ" "HT"]))
