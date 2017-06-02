(ns medium.p58)

;; FUNCTION COMPOSITION

;; Difficulty: Medium
;; Topics: higher-order-functions core-functions

;; Special restrictions:
;; comp

;; Write a function which allows you to create function compositions.  The parameter list should take a variable number of functions, and create a function that applies them from right-to-left.

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(= [3 2 1] ((__ rest reverse) [1 2 3 4]))
(= 5 ((__ (partial + 3) second) [1 2 3 4]))
(= true ((__ zero? #(mod % 8) +) 3 5 7 9))
(= "HELLO" ((__ #(.toUpperCase %) #(apply str %) take) 5 "hello world"))