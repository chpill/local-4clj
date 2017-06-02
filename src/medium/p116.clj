(ns medium.p116)

;; PRIME SANDWICH

;; Difficulty: Medium
;; Topics: math

;; A ;; http://en.wikipedia.org/wiki/Balanced_prime;;  is a prime number which is also the mean of the primes directly before and after it in the sequence of valid primes.  Create a function which takes an integer n, and returns true iff it is a balanced prime.

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(= false (__ 4))
(= true (__ 563))
(= 1103 (nth (filter __ (range)) 15))