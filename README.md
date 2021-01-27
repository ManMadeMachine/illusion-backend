 # illusion-backend

Start the DB and pgAdmin with `docker-compose up`

Access pgAdmin from `localhost:80`. Connect to a running postgreSQL server with

 * hostname: `host.docker.internal`   
 * port: `5432 (default port)`  
 * user: `postgres`  

Start the backend with `./mvnw spring-boot:run`. The application should initialize the needed tables with some test data. Access the backend from `localhost:8080`
