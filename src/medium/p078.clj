(ns medium.p78)

;; REIMPLEMENT TRAMPOLINE

;; Difficulty: Medium
;; Topics: core-functions

;; Special restrictions:
;; trampoline

;; Reimplement the function described in ;; 76;; .

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(= (letfn [(triple [x] #(sub-two (* 3 x)))
          (sub-two [x] #(stop?(- x 2)))
          (stop? [x] (if (> x 50) x #(triple x)))]
    (__ triple 2))
  82)
(= (letfn [(my-even? [x] (if (zero? x) true #(my-odd? (dec x))))
          (my-odd? [x] (if (zero? x) false #(my-even? (dec x))))]
    (map (partial __ my-even?) (range 6)))
  [true false true false true false])