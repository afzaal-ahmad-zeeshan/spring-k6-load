FROM eclipse-temurin:17-jdk
WORKDIR /target
COPY "./spring-k6-load-*.jar" ./app.jar
EXPOSE 8080
ENTRYPOINT [ "java", "-jar", "./app.jar" ]
