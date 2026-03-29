FROM eclipse-temurin:17-jdk-alpine  
# ↑ Use Java 17 (same version you have installed)

WORKDIR /app                         
# ↑ Create a folder called /app inside the container

COPY target/learning-0.0.1-SNAPSHOT.jar app.jar  
# ↑ Copy your JAR file into the container

EXPOSE 8080                          
# ↑ Open port 8080 for traffic

ENTRYPOINT ["java", "-jar", "app.jar"]
# ↑ Run your app when the container starts