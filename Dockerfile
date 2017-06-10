FROM clojure:boot-alpine

ADD build.boot /deps/build.boot
ADD boot.properties /deps/boot.properties

WORKDIR /code

CMD boot wait nightlight --port 4000

RUN cd /deps && boot nightlight