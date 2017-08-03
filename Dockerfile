FROM openjdk:8-jre-alpine
MAINTAINER BBPax
EXPOSE 8080
COPY build/libs/gs-spring-boot-docker-1.0.jar /smfolder/hw.jar
CMD ["java", "-jar", "/smfolder/hw.jar"]