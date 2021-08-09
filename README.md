# Notes App Backend - Spring Boot MySQL Base Project

Technologies Used

- Spring Boot 2.4.4
- Spring Data JPA
- Lombok
- MySQL

How to Run this application

First change the **src/main/resources/application.properties** with your MySQL instance properties.

Then,

```shell
$ ./gradlew bootRun
```

or create a build using following command,

```shell
$ ./gradlew clean build
```

Then start the JAR file using java

```shell
$ java -jar build/libs/notes4back-0.0.1-SNAPSHOT.jar
```
