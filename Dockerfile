FROM registry.access.redhat.com/ubi8/openjdk-11

MAINTAINER Christopher Tate <computate@computate.org>

USER root
COPY . computateorg
RUN microdnf install -y git
RUN git clone https://github.com/computate-org/computate.git /home/jboss/computate
WORKDIR /home/jboss/computate
RUN mvn clean install -DskipTests
WORKDIR /home/jboss/computateorg
RUN mvn clean install -DskipTests
RUN cp /home/jboss/computateorg/target/*.jar /home/jboss/app.jar
CMD java $JAVA_OPTS -cp .:* org.computate.site.enus.vertx.MainVerticle

