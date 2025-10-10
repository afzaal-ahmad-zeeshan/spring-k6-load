# Spring and K6 (Load Testing)

This project is a basic Spring Boot application that exposes an endpoint to
create and query the objects created in an in-memory data. The project
demonstrates how to use K6 to perform various load testing on your application,
and to review the results in a web-based dashboard.

## Build and package

The application is developed using Spring framework and uses Maven for build
and package management system. Use the following command to package the project:

```bash
$ ./mvnw package
```

The output of this command can be used with Docker.

## K6 folder

The K6 scripts are added to the `/src/test/load` folder. Read the `README.md`
file added to that folder.

## Contributions

Contributions are welcome.
