FROM registry.access.redhat.com/ubi8/ubi

MAINTAINER Christopher Tate <computate@computate.org>

ENV APP_DEPENDENCIES="git java-11-openjdk-devel maven"

USER root
COPY . /root/src/computateorg

RUN yum install -y ${APP_DEPENDENCIES}
RUN git clone https://github.com/computate-org/computate.git /root/src/computate
RUN git clone https://github.com/computate-org/computate-search.git /root/src/computate-search
RUN git clone https://github.com/computate-org/computate-vertx.git /root/src/computate-vertx
WORKDIR /root/src/computateorg
RUN mvn clean install -DskipTests
RUN cp /root/src/computateorg/target/*.jar /root/src/app.jar
CMD java $JAVA_OPTS -cp .:* org.computate.site.enus.vertx.MainVerticle

