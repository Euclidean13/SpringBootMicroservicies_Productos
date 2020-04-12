FROM openjdk:11
VOLUME /tmp
ADD ./target/springboot-servicio-productos-server-0.0.1-SNAPSHOT.jar productos-server.jar
ENTRYPOINT ["java", "-jar", "/productos-server.jar"]