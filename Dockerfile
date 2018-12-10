#FROM frolvlad/alpine-oraclejdk8:slim
#VOLUME /tmp
#ADD target/doctors-0.0.1-SNAPSHOT.jar doctors.jar
#RUN sh -c 'touch /doctors.jar'
#EXPOSE 8080
#ENV JAVA_OPTS =""
#ENTRYPOINT [ "sh","-c","java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /doctors.jar" ]
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dvaja.security.egd=file:/dev/./urandom","-jar","/app.jar"]