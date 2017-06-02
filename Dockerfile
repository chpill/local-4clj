FROM clojure:boot-alpine

ADD build.boot /deps/build.boot

CMD boot dev

WORKDIR /code

RUN cd /deps && boot deps