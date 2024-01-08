FROM adoptopenjdk/openjdk11:latest
COPY target/location-search-api-0.0.1-SNAPSHOT.jar location-search-api.jar
ENTRYPOINT ["java","-jar","/location-search-api.jar"]