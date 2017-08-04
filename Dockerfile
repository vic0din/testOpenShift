FROM openjdk:8-jre-alpine
MAINTAINER BBPax
EXPOSE 8080
COPY target/libs/openshift-hello-world-1.7.jar /smfolder/hw.jar
CMD ["java", "-jar", "/smfolder/hw.jar"]
