# Never use "latest" as base container but specific tagged version instead
FROM anapsix/alpine-java:8u144b01_jdk

# Copy application JAR(s) to /app
COPY target/uberjar/docker-demo-0.1.0-standalone.jar /
COPY docker-entrypoint.sh /
RUN apk add --update bash && chmod +x /docker-entrypoint.sh

EXPOSE 8080

ENTRYPOINT ["/docker-entrypoint.sh"]
