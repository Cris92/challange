FROM java:8

VOLUME /tmp  

ADD frontend-0.0.1-SNAPSHOT.jar frontend-0.0.1-SNAPSHOT.jar 

ENTRYPOINT ["java","-jar","-Dspring.profiles.active=dev","frontend-0.0.1-SNAPSHOT.jar"]
