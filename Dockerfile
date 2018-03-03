FROM java:8
ADD target/registration-service.jar registration-service.jar
ENTRYPOINT ["java","-jar","registration-service.jar"]