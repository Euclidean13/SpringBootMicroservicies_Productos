FROM openjdk:11
VOLUME /tmp
ADD ./target/springboot-servicio-usuarios-server-0.0.1-SNAPSHOT.jar usuarios-server.jar
ENTRYPOINT ["java", "-jar", "/usuarios-server.jar"]