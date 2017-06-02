(ns easy.p88)

;; SYMMETRIC DIFFERENCE

;; Difficulty: Easy
;; Topics: set-theory

;; Write a function which returns the symmetric difference of two sets.  The symmetric difference is the set of items belonging to one but not both of the two sets.

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(= (__ #{1 2 3 4 5 6} #{1 3 5 7}) #{2 4 6 7})
(= (__ #{:a :b :c} #{}) #{:a :b :c})
(= (__ #{} #{4 5 6}) #{4 5 6})
(= (__ #{[1 2] [2 3]} #{[2 3] [3 4]}) #{[1 2] [3 4]})