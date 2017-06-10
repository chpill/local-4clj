(ns medium.p56)

;; FIND DISTINCT ITEMS

;; Difficulty: Medium
;; Topics: seqs core-functions

;; Special restrictions:
;; distinct

;; Write a function which removes the duplicates from a sequence. Order of the items must be maintained.

(def __ ;; Your solution here!

  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= (__ [1 2 1 3 1 2 4]) [1 2 3 4])
(= (__ [:a :a :b :b :c :c]) [:a :b :c])
(= (__ '([2 4] [1 2] [1 3] [1 3])) '([2 4] [1 2] [1 3]))
(= (__ (range 50)) (range 50))