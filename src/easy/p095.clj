(ns easy.p95)

;; TO TREE, OR NOT TO TREE

;; Difficulty: Easy
;; Topics: trees

;; Write a predicate which checks whether or not a given sequence represents a ;; http://en.wikipedia.org/wiki/Binary_tree;; .  Each node in the tree must have a value, a left child, and a right child.

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(= (__ '(:a (:b nil nil) nil))
   true)
(= (__ '(:a (:b nil nil)))
   false)
(= (__ [1 nil [2 [3 nil nil] [4 nil nil]]])
   true)
(= (__ [1 [2 nil nil] [3 nil nil] [4 nil nil]])
   false)
(= (__ [1 [2 [3 [4 nil nil] nil] nil] nil])
   true)
(= (__ [1 [2 [3 [4 false nil] nil] nil] nil])
   false)
(= (__ '(:a nil ()))
   false)
