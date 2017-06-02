#!/bin/sh

set -e

docker build -t local-4clj .

docker run --rm\
       --volume $(pwd):/code\
       --publish "4000:4000"\
       local-4clj
