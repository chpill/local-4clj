(ns easy.p147)

;; PASCAL'S TRAPEZOID

;; Difficulty: Easy
;; Topics: seqs

;; Write a function that, for any given input vector of numbers, returns an infinite lazy sequence of vectors, where each next one is constructed from the previous following the rules used in http://en.wikipedia.org/wiki/Pascal's_triangle. For example, for [3 1 2], the next row is [3 4 3 2].;; Beware of arithmetic overflow! In clojure (since version 1.3 in 2011), if you use an arithmetic operator like + and the result is too large to fit into a 64-bit integer, an exception is thrown. You can use +' to indicate that you would rather overflow into Clojure's slower, arbitrary-precision bigint.

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(= (second (__ [2 3 2])) [2 5 5 2])
(= (take 5 (__ [1])) [[1] [1 1] [1 2 1] [1 3 3 1] [1 4 6 4 1]])
(= (take 2 (__ [3 1 2])) [[3 1 2] [3 4 3 2]])
(= (take 100 (__ [2 4 2])) (rest (take 101 (__ [2 2]))))