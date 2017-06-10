(ns hard.p111)

;; CROSSWORD PUZZLE

;; Difficulty: Hard
;; Topics: game

;; Write a function that takes a string and a partially-filled crossword puzzle board, and determines if the input string can be legally placed onto the board.


;; The crossword puzzle board consists of a collection of partially-filled rows.  Empty spaces are denoted with an underscore (_), unusable spaces are denoted with a hash symbol (#), and pre-filled spaces have a character in place; the whitespace characters are for legibility and should be ignored.

;; For a word to be legally placed on the board:

;; - It may use empty spaces (underscores)

;; - It may use but must not conflict with any pre-filled characters.

;; - It must not use any unusable spaces (hashes).

;; - There must be no empty spaces (underscores) or extra characters before or after the word (the word may be bound by unusable spaces though).

;; - Characters are not case-sensitive. 

;; - Words may be placed vertically (proceeding top-down only), or horizontally (proceeding left-right only).

(def __ ;; Your solution here!

  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= true  (__ "the" ["_ # _ _ e"]))
(= false (__ "the" ["c _ _ _"
                    "d _ # e"
                    "r y _ _"]))
(= true  (__ "joy" ["c _ _ _"
                    "d _ # e"
                    "r y _ _"]))
(= false (__ "joy" ["c o n j"
                    "_ _ y _"
                    "r _ _ #"]))
(= true  (__ "clojure" ["_ _ _ # j o y"
                        "_ _ o _ _ _ _"
                        "_ _ f _ # _ _"]))
