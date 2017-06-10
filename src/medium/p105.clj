(ns medium.p105)

;; IDENTIFY KEYS AND VALUES

;; Difficulty: Medium
;; Topics: maps seqs

;; Given an input sequence of keywords and numbers, create a map such that each key in the map is a keyword, and the value is a sequence of all the numbers (if any) between it and the next keyword in the sequence.

(def __ ;; Your solution here!
  
  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= {} (__ []))
(= {:a [1]} (__ [:a 1]))
(= {:a [1], :b [2]} (__ [:a 1, :b 2]))
(= {:a [1 2 3], :b [], :c [4]} (__ [:a 1 2 3 :b :c 4]))