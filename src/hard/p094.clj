(ns hard.p94)

;; GAME OF LIFE

;; Difficulty: Hard
;; Topics: game

;; The ;; http://en.wikipedia.org/wiki/Conway's_Game_of_Life;;  is a cellular automaton devised by mathematician John Conway. ;; The 'board' consists of both live (#) and dead ( ) cells. Each cell interacts with its eight neighbours (horizontal, vertical, diagonal), and its next state is dependent on the following rules:;; 1) Any live cell with fewer than two live neighbours dies, as if caused by under-population.;; 2) Any live cell with two or three live neighbours lives on to the next generation.;; 3) Any live cell with more than three live neighbours dies, as if by overcrowding.;; 4) Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.;; Write a function that accepts a board, and returns a board representing the next generation of cells.

(def __
  ,,,
  ;; Your code here!
  ,,,)

;; Test cases:
(= (__ ["      "  
        " ##   "
        " ##   "
        "   ## "
        "   ## "
        "      "])
   ["      "  
    " ##   "
    " #    "
    "    # "
    "   ## "
    "      "])
(= (__ ["     "
        "     "
        " ### "
        "     "
        "     "])
   ["     "
    "  #  "
    "  #  "
    "  #  "
    "     "])
(= (__ ["      "
        "      "
        "  ### "
        " ###  "
        "      "
        "      "])
   ["      "
    "   #  "
    " #  # "
    " #  # "
    "  #   "
    "      "])