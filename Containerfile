FROM registry.access.redhat.com/ubi8/ubi

MAINTAINER Christopher Tate <computate@computate.org>

ENV APP_DEPENDENCIES="git java-11-openjdk-devel maven"

USER root
COPY . computateorg

RUN yum install -y ${APP_DEPENDENCIES}
RUN git clone https://github.com/computate-org/computate.git /root/src/computate

WORKDIR /home/jboss/computateorg
RUN mvn clean install -DskipTests
RUN cp /home/jboss/computateorg/target/*.jar /home/jboss/app.jar
CMD java $JAVA_OPTS -cp .:* org.computate.site.enus.vertx.MainVerticle

