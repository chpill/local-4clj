#!/bin/sh

set -e

docker run --rm\
       --tty\
       --interactive\
       --volume $(pwd):/code\
       --publish "4000:4000"\
       chpill/local-4clj:0.0.2
