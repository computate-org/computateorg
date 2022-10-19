FROM registry.access.redhat.com/ubi8/openjdk-11

MAINTAINER Christopher Tate <computate@computate.org>

COPY . computateorg
USER root

WORKDIR /home/jboss/computateorg
RUN mvn clean install -DskipTests
RUN cp /home/jboss/computateorg/target/*.jar /home/jboss/app.jar
CMD java $JAVA_OPTS -cp .:* org.computate.site.enus.vertx.MainVerticle

