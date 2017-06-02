(ns hard.p84)

;; TRANSITIVE CLOSURE

;; Difficulty: Hard
;; Topics: set-theory

;; Write a function which generates the ;; http://en.wikipedia.org/wiki/Transitive_closure;;  of a ;; http://en.wikipedia.org/wiki/Binary_relation;; .  The relation will be represented as a set of 2 item vectors.

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(let [divides #{[8 4] [9 3] [4 2] [27 9]}]
  (= (__ divides) #{[4 2] [8 4] [8 2] [9 3] [27 9] [27 3]}))
(let [more-legs
      #{["cat" "man"] ["man" "snake"] ["spider" "cat"]}]
  (= (__ more-legs)
     #{["cat" "man"] ["cat" "snake"] ["man" "snake"]
       ["spider" "cat"] ["spider" "man"] ["spider" "snake"]}))
(let [progeny
      #{["father" "son"] ["uncle" "cousin"] ["son" "grandson"]}]
  (= (__ progeny)
     #{["father" "son"] ["father" "grandson"]
       ["uncle" "cousin"] ["son" "grandson"]}))