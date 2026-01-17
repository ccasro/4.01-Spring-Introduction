# 4.01-Spring-Introduction

## 📄 Description

This repository contains a simple Spring Boot REST API developed as a learning exercise to practice the fundamentals of backend development with Java.
The application exposes several REST endpoints to manage a list of users in memory (no database), allowing you to:
Create users
List all users
Retrieve a user by ID
Filter users by name

The project also includes unit tests for the controller layer using MockMvc to ensure correct behavior of the API endpoints.

## 💻 Technologies used

Java 17+
Spring Boot
Maven
JUnit 5
Spring Boot Test (MockMvc)
Jackson (JSON serialization)
IntelliJ IDEA
Postman

## 📋 Requirements

Java 17 or higher
Maven (IntelliJ bundled Maven is sufficient)
IDE capable of running Spring Boot projects (IntelliJ IDEA, Eclipse, etc.)

## 🛠️ Installation

1. Clone the repository:

```bash
git clone https://github.com/ccasro/4.01-Spring-Introduction/
```

2. Open the project in your IDE (e.g., IntelliJ IDEA)
3. Ensure Maven dependencies are downloaded automatically

## ▶️ Execution

Run the application by executing the main Spring Boot class:
UserApiApplication.java

The application will start on:
http://localhost:9000

## 🌐 Available Endpoints

- GET /users
  Returns the list of all users.

- POST /users
  Creates a new user.

- GET /users/{id}
  Returns a user by its UUID.

- GET /users?name
  Filter users by name (case-insensitive).

## 🧪 Testing

The project includes controller tests using @WebMvcTest and MockMvc.

To run the tests:

```bash
mvn test
```

The tests verify:

* Empty user list initially
* User creation with generated UUID
* User retrieval by ID
* 404 response when user does not exist
* Filtering users by name

## 🌐 Deployment
No production deployment is required for this exercise

## 🤝 Contributions

- Use the main branch for development.
- Make small, frequent commits following Conventional Commits.
- Do not add compiled files or credentials to the repository.
- To propose improvements, create a branch and open a pull request.

## 📌 Notes

This project is intended for learning and practice purposes, focusing on:

* REST API design
* JSON request/response handling
* UUID-based identifiers
* Controller-level testing without persistence