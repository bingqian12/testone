FROM openjdk:8u181-jdk-alpine
WORKDIR /home/apps/
COPY target/*.jar demoone-0.0.1-SNAPSHOT.war
RUN sh -c 'touch demoone-0.0.1-SNAPSHOT.war'
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar -Xmx256m demoone-0.0.1-SNAPSHOT.war" ]