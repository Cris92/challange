FROM java:8

VOLUME /tmp  

ADD rest-0.0.1-SNAPSHOT.jar rest-0.0.1-SNAPSHOT.jar 

ENTRYPOINT ["java","-jar","-Dspring.profiles.active=dev","rest-0.0.1-SNAPSHOT.jar"]
