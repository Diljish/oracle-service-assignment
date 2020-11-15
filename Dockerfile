FROM openjdk:8
ADD ./target/oracle-0.0.1-SNAPSHOT.jar oracle-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","oracle-0.0.1-SNAPSHOT.jar"]