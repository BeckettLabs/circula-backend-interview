# Circula Backend Interview

A small Spring Boot starter project used for Circula's backend interviews. It boots up with a `/hello-world` endpoint so you can confirm your environment is working before the interview begins.

## Tech stack

- Spring Boot 3.5 (Web MVC, Data JPA, Data JDBC)
- Kotlin 2.2 — you can write your code in **either Java or Kotlin**, whichever you prefer
- H2 in-memory database
- JUnit 5
- Maven

Use the IDE of your choice (IntelliJ IDEA, VS Code, Eclipse, …).

## Prerequisites

- JDK 17
- Maven 3.9+

## Running the app

Unzip the project, then from the project root:

```sh
mvn spring-boot:run
```

The app starts on `http://localhost:8080`. Verify with:

```sh
curl http://localhost:8080/hello-world
curl http://localhost:8080/hello-world2
```

## Running the tests

```sh
mvn test
```

## Before the interview

Please unzip the project and make sure both commands above run successfully on your machine. We'll work from this codebase together during the session.
