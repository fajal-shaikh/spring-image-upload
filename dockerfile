# Use official OpenJDK 11 image with slim variant to reduce size
FROM openjdk:11-jre-slim

# Set working directory
WORKDIR /app

# Copy the built WAR file (renamed for simplicity)
COPY target/spring-boot-upload-image-0.0.1-SNAPSHOT.war app.war

# Expose the port your app runs on (matches your ECS task definition)
EXPOSE 8089

# Run with production profile and explicit port/context path configuration
ENTRYPOINT ["java", "-jar", "app.war", \
            "--server.port=8089", \
            "--spring.profiles.active=production"]
