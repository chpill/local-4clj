FROM clojure:boot-alpine

ADD build.boot /deps/build.boot

ENV TINI_VERSION v0.9.0
ADD https://github.com/krallin/tini/releases/download/${TINI_VERSION}/tini /tini
RUN chmod +x /tini
ENTRYPOINT ["/tini", "--"]

WORKDIR /code

CMD /tini boot dev

RUN cd /deps && boot deps