(ns elementary.p14)

;; INTRO TO FUNCTIONS

;; Difficulty: Elementary

;; Clojure has many different ways to create functions.

(def __ ;; Your solution here!
  
  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= __ ((fn add-five [x] (+ x 5)) 3))
(= __ ((fn [x] (+ x 5)) 3))
(= __ (#(+ % 5) 3))
(= __ ((partial + 5) 3))