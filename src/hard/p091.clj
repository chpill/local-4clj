(ns hard.p91)

;; GRAPH CONNECTIVITY

;; Difficulty: Hard
;; Topics: graph-theory

;; Given a graph, determine whether the graph is connected. A connected graph is such that a path exists between any two given nodes.;; -Your function must return true if the graph is connected and false otherwise.;; -You will be given a set of tuples representing the edges of a graph. Each member of a tuple being a vertex/node in the graph.;; -Each edge is undirected (can be traversed either direction).

(def __ ;; Your solution here!
  
  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= true (__ #{[:a :a]}))
(= true (__ #{[:a :b]}))
(= false (__ #{[1 2] [2 3] [3 1]
               [4 5] [5 6] [6 4]}))
(= true (__ #{[1 2] [2 3] [3 1]
              [4 5] [5 6] [6 4] [3 4]}))
(= false (__ #{[:a :b] [:b :c] [:c :d]
               [:x :y] [:d :a] [:b :e]}))
(= true (__ #{[:a :b] [:b :c] [:c :d]
              [:x :y] [:d :a] [:b :e] [:x :a]}))