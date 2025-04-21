FROM openjdk:11
ARG PROJECT_VERSION=0.1.0

RUN mkdir -p /home/app
WORKDIR /home/app

ENV SPRING_PROFILES_ACTIVE=dev

# Copy only the JAR — no need for source code inside the container
COPY target/service-discovery-ecommerce-v${PROJECT_VERSION}.jar service-discovery-ecommerce.jar

EXPOSE 8761

ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "service-discovery-ecommerce.jar"]


#docker build -t service-discovery-ecommerce:0.1.0 .
#docker run -d --name service-discovery-container -p 8761:8761 service-discovery-ecommerce:0.1.0

