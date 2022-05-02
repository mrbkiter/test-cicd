FROM bellsoft/liberica-openjdk-alpine:17
WORKDIR ~
ENV server.port=80
EXPOSE 80
ARG JAVA_OPTS=-Xmx1024m -Xms512m
ADD . ./
RUN chmod -R 777 .

ENTRYPOINT ["./run.sh", "$JAVA_OPTS"]