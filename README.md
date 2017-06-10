# local-4clj

Problems of the famous [4clojure] site.

[4clojure]: http://4clojure.com

It is recommended that you create an account there, and do the problems in the
order suggested.

This project provides the same problems, but with an embedded
editor [nightlight](https://sekao.net/nightlight/). You get a repl for free (to
use it, toggle `instaREPL` in the interface), and [parinfer] will help you edit
your first clojure forms.

[parinfer]: https://shaunlebron.github.io/parinfer/

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
(def __ ;; Your solution here!
  (fn [a b]
    ,,,)
  ,,,)
```

Of course, in a normal project, you would use a `defn`, but for this special case, just write the function this way, it will be easier to copy-paste your response on [4clojure] later.

Also, notice that if you toggle on the InstaREPL, any form you write in the file
will be evaluated. This allows you to experiment easily with partial solutions
with a very tight feedback loop.


## Build and push the docker image

If you want to build the docker image `docker build -t <your docker hub
handle>/local-4clj:<tag> .`.

Then `docker push <your docker hub handle>/local-4clj:<tag>`


## License

Copyright © 2017 chpill

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
