(ns easy.p90)

;; CARTESIAN PRODUCT

;; Difficulty: Easy
;; Topics: set-theory

;; Write a function which calculates the ;; http://en.wikipedia.org/wiki/Cartesian_product;;  of two sets.

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(= (__ #{"ace" "king" "queen"} #{"♠" "♥" "♦" "♣"})
   #{["ace"   "♠"] ["ace"   "♥"] ["ace"   "♦"] ["ace"   "♣"]
     ["king"  "♠"] ["king"  "♥"] ["king"  "♦"] ["king"  "♣"]
     ["queen" "♠"] ["queen" "♥"] ["queen" "♦"] ["queen" "♣"]})
(= (__ #{1 2 3} #{4 5})
   #{[1 4] [2 4] [3 4] [1 5] [2 5] [3 5]})
(= 300 (count (__ (into #{} (range 10))
                  (into #{} (range 30)))))