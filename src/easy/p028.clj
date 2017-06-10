(ns easy.p28)

;; FLATTEN A SEQUENCE

;; Difficulty: Easy
;; Topics: seqs core-functions

;; Special restrictions:
;; flatten

;; Write a function which flattens a sequence.

(def __ ;; Your solution here!

  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= (__ '((1 2) 3 [4 [5 6]])) '(1 2 3 4 5 6))
(= (__ ["a" ["b"] "c"]) '("a" "b" "c"))
(= (__ '((((:a))))) '(:a))