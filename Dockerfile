FROM openjdk:21-jdk-slim
WORKDIR /app

# Copy Maven wrapper and pom.xml for dependency caching
COPY pom.xml .
COPY .mvn/ .mvn
COPY mvnw .

# Download dependencies
RUN ./mvnw dependency:go-offline -B

# Copy source code and build the application
COPY src ./src
RUN ./mvnw package -DskipTests

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "target/movieApi-0.0.1-SNAPSHOT.jar"]