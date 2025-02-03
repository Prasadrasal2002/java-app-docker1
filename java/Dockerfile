FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY ./src/SimpleJavaApp.java /app/SimpleJavaApp.java
RUN javac SimpleJavaApp.java
CMD ["java", "SimpleJavaApp"]
