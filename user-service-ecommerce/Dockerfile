FROM openjdk:11
ARG PROJECT_VERSION=0.1.0
RUN mkdir -p /home/app
WORKDIR /home/app
ENV SPRING_PROFILES_ACTIVE dev
ADD target/user-service-ecommerce-v${PROJECT_VERSION}.jar user-service-ecommerce.jar
EXPOSE 8700
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "user-service-ecommerce.jar"]