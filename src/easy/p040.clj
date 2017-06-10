(ns easy.p40)

;; INTERPOSE A SEQ

;; Difficulty: Easy
;; Topics: seqs core-functions

;; Special restrictions:
;; interpose

;; Write a function which separates the items of a sequence by an arbitrary value.

(def __ ;; Your solution here!
  
  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= (__ 0 [1 2 3]) [1 0 2 0 3])
(= (apply str (__ ", " ["one" "two" "three"])) "one, two, three")
(= (__ :z [:a :b :c :d]) [:a :z :b :z :c :z :d])