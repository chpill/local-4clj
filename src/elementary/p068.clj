(ns elementary.p68)

;; RECURRING THEME

;; Difficulty: Elementary
;; Topics: recursion

;; Clojure only has one non-stack-consuming looping construct: recur.  Either a function or a loop can be used as the recursion point.  Either way, recur rebinds the bindings of the recursion point to the values it is passed.  Recur must be called from the tail-position, and calling it elsewhere will result in an error.

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(= __
  (loop [x 5
         result []]
    (if (> x 0)
      (recur (dec x) (conj result (+ 2 x)))
      result)))