#!/bin/sh

set -e

#docker build -t local-4clj .

docker run --rm\
       --tty\
       --interactive\
       --volume $(pwd):/code\
       --publish "4000:4000"\
       chpill/local-4clj
