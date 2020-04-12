FROM openjdk:11
VOLUME /tmp
EXPOSE 9100
ADD ./target/springboot-servicio-oauth-server-0.0.1-SNAPSHOT.jar oauth-server.jar
ENTRYPOINT ["java", "-jar", "/oauth-server.jar"]