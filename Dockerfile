FROM openjdk:8
EXPOSE 8080
ADD target/github-actions-cicd.jar github-actions-cicd.jar
ENTRYPOINT ["java" "-jar" "/github-actions-cicd.jar"]