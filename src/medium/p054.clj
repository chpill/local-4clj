(ns medium.p54)

;; PARTITION A SEQUENCE

;; Difficulty: Medium
;; Topics: seqs core-functions

;; Special restrictions:
;; partition
;; partition-all

;; Write a function which returns a sequence of lists of x items each.  Lists of less than x items should not be returned.

(def __ ;; Your solution here!
  
  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= (__ 3 (range 9)) '((0 1 2) (3 4 5) (6 7 8)))
(= (__ 2 (range 8)) '((0 1) (2 3) (4 5) (6 7)))
(= (__ 3 (range 8)) '((0 1 2) (3 4 5)))