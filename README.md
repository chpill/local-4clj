# local-4clj

Problems of the famous [4clojure] site.

[4clojure]: http://4clojure.com

It is recommended that you create an account there, and do the problems in the
order suggested.

This project provide the same problems, but with an embedded
editor [nightlight](https://sekao.net/nightlight/). It provides you with a repl
(to use it, toggle `instaREPL` in the interface).

You'll know you've solved the problem when all the test-cases evaluates to
`true`. You should then copy-paste your solution on [4clojure], as it will allow
you to study the solutions of other users (the whole point, really).

**NB**: If you have never written a single line of clojure, you should start
with the [clojure koans](https://github.com/functional-koans/clojure-koans) to
discover the syntax, then come back to [4clojure].


## Usage

* If you have boot on your machine: `boot wait nightlight --port 4000`
* If you have lein on your machine: `lein nightlight --port 4000`
* If you have docker on your machine: `./docker-run.sh`

If you have none of the above, my recommendation would be
to [install boot](https://github.com/boot-clj/boot#install) and go from there.

## Tips

the `(def __ ...)` part is there to help you format your code in the way
4clojure expects it. Oftentimes, you will need to write a function in there:

```
(def __
  ;; Your code here!
  (fn [a b]
    ,,,)
  ,,,)
```

Of course, in a normal project, you would use a `defn` there. 


## License

Copyright © 2017 chpill

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
