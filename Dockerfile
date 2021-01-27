FROM adoptopenjdk:14-jre-hotspot

# TODO: Build the jar before copying and running it..?
# So basically WORKDIR -> COPY . . -> RUN ./mvnw clean package -> run jar
RUN mkdir -p /backend
WORKDIR /backend

COPY . .

RUN ./mvnw clean package -DskipTests 
ENTRYPOINT [ "java", "-jar", "/target/backend-0.0.1-SNAPSHOT.jar" ]