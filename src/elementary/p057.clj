(ns elementary.p57)

;; SIMPLE RECURSION

;; Difficulty: Elementary
;; Topics: recursion

;; A recursive function is a function which calls itself.  This is one of the fundamental techniques used in functional programming.

(def __ ;; Your solution here!

  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= __ ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))