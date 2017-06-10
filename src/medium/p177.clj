(ns medium.p177)

;; BALANCING BRACKETS

;; Difficulty: Medium
;; Topics: parsing

;; When parsing a snippet of code it's often a good idea to do a sanity check to see if all the brackets match up. Write a function that takes in a string and returns truthy if all square [ ] round ( ) and curly { } brackets are properly paired and legally nested, or returns falsey otherwise.

(def __ ;; Your solution here!

  ,,,)



;; Test cases (evaluates to true when your solution is correct):
(__ "This string has no brackets.")
(__ "class Test {
      public static void main(String[] args) {
        System.out.println(\"Hello world.\");
      }
    }")
(not (__ "(start, end]"))
(not (__ "())"))
(not (__ "[ { ] } "))
(__ "([]([(()){()}(()(()))(([[]]({}()))())]((((()()))))))")
(not (__ "([]([(()){()}(()(()))(([[]]({}([)))())]((((()()))))))"))
(not (__ "["))