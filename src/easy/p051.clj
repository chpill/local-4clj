(ns easy.p51)

;; ADVANCED DESTRUCTURING

;; Difficulty: Easy
;; Topics: destructuring

;; Here is an example of some more sophisticated destructuring.

(def __ ;; Your solution here!

  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= [1 2 [3 4 5] [1 2 3 4 5]] (let [[a b & c :as d] __] [a b c d]))