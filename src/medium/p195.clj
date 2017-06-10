(ns medium.p195)

;; PARENTHESES... AGAIN

;; Difficulty: Medium
;; Topics: math combinatorics

;; In a family of languages like Lisp, having balanced parentheses is a defining feature of the language. Luckily, Lisp has almost no syntax, except for these "delimiters" -- and that hardly qualifies as "syntax", at least in any useful computer programming sense.;; It is not a difficult exercise to find all the combinations of well-formed parentheses if we only have N pairs to work with. For instance, if we only have 2 pairs, we only have two possible combinations: "()()" and "(())". Any other combination of length 4 is ill-formed. Can you see why? ;; Generate all possible combinations of well-formed parentheses of length 2n (n pairs of parentheses).
;; For this problem, we only consider '(' and ')', but the answer is similar if you work with only {} or only [].;; There is an interesting pattern in the numbers!

(def __ ;; Your solution here!
  
  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(= [#{""} #{"()"} #{"()()" "(())"}] (map (fn [n] (__ n)) [0 1 2]))
(= #{"((()))" "()()()" "()(())" "(())()" "(()())"} (__ 3))
(= 16796 (count (__ 10)))
(= (nth (sort (filter #(.contains ^String % "(()()()())") (__ 9))) 6) "(((()()()())(())))")
(= (nth (sort (__ 12)) 5000) "(((((()()()()()))))(()))")