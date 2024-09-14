
# Kids Management System

A Spring Boot-based REST API to manage families, parents, and kids. The project allows you to create, retrieve, and manage families, parents, and kids in a relational database (PostgreSQL).


## Features

- Create and manage `Family` entities, with associated `Parent` and `Kid` entities.
- Supports one-to-many relationships between `Family` and `Parent`, as well as `Family` and `Kid`.
- Validation of DTOs using the Jakarta Validation API (`@NotNull`, `@Size`, etc.).
- RESTful API endpoints to create, retrieve, and manage data.
- Uses PostgreSQL for persistent data storage.

## Technologies Used

- **Java 17**
- **Spring Boot 3.3.3**
    - Spring Web (REST API)
    - Spring Data JPA (ORM)
    - Hibernate (ORM)
- **PostgreSQL** (Database)
- **Lombok** (Boilerplate reduction)
- **Maven** (Build tool)
- **Jakarta Bean Validation (Hibernate Validator)**

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.kids_management
│   │       ├── controller     # REST API Controllers
│   │       ├── dto            # Data Transfer Objects (DTOs)
│   │       ├── model          # JPA Entities
│   │       ├── repository     # Spring Data JPA Repositories
│   │       └── service        # Service Layer (Business Logic)
│   └── resources
│       ├── application.yml    # Application Configuration (Database, JPA, etc.)
│       └── schema.sql         # SQL scripts to initialize the database (Optional)
└── test
    └── java
        └── com.kids_management  # Unit and Integration Tests
```



## Running the Application

After configuring your PostgreSQL database and `application.yml`, run the application using:

```bash
mvn spring-boot:run
```

This will start the Spring Boot application on the default port `8080`.

