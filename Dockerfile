# Use a base image with Java installed
FROM eclipse-temurin:19-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY target/apidemo-0.0.1-SNAPSHOT.jar /app/apidemo.jar

# Expose the port your Spring Boot app is running on (adjust this if your app uses a different port)
EXPOSE 8080

# Command to run your Spring Boot app
CMD ["java", "-jar", "apidemo.jar"]
