(ns easy.p173)

;; INTRO TO DESTRUCTURING 2

;; Difficulty: Easy
;; Topics: Destructuring

;; Sequential destructuring allows you to bind symbols to parts of sequential things (vectors, lists, seqs, etc.): ;; http://clojure.org/special_forms#Special Forms--(let [bindings* ] exprs*)

;; Complete the bindings so all let-parts evaluate to 3.

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(= 3
  (let [[__] [+ (range 3)]] (apply __))
  (let [[[__] b] [[+ 1] 2]] (__ b))
  (let [[__] [inc 2]] (__)))