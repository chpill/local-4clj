(ns elementary.p134)

;; A NIL KEY

;; Difficulty: Elementary
;; Topics: maps

;; Write a function which, given a key and map, returns true ;; http://en.wikipedia.org/wiki/If_and_only_if;;  the map contains an entry with that key and its value is nil.

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(true?  (__ :a {:a nil :b 2}))
(false? (__ :b {:a nil :b 2}))
(false? (__ :c {:a nil :b 2}))