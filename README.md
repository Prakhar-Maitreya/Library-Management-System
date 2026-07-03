# 📚 Library Management System API

A simple RESTful API built with **Spring Boot** and **Java** for managing basic library records. This project handles Books, Authors, Categories, Users, and User Profiles, and provides endpoints to create and view data, plus assign a borrowed book to a user.

## 🚀 Features

- **Book Management:** Add books, retrieve all books, retrieve a book by ID, and mark a book as borrowed by a user.
- **Author Management:** Add authors and retrieve all authors.
- **Category Management:** Add categories and retrieve all categories.
- **User Management:** Register users, retrieve all users, and retrieve a user by ID.
- **Profile Management:** Store optional profile details such as email, phone, and address when creating a user.
- **Relational Database Mapping:** Uses Spring Data JPA / Hibernate to map relationships between books, authors, categories, users, and profiles.

## 🛠️ Technology Stack

- **Java** (configured for JDK 21)
- **Spring Boot** (REST API framework)
- **Spring Web** (HTTP endpoints)
- **Spring Data JPA** (ORM / database interactions)
- **Hibernate** (JPA implementation)
- **PostgreSQL** (configured database)
- **Maven** (dependency management and build tool)

## ⚙️ Prerequisites

Before you begin, ensure you have:

- Java Development Kit installed.
- Maven installed, or use the included Maven Wrapper.
- PostgreSQL running locally.
- A PostgreSQL database named `librarydb`.
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code.

## 🏃‍♂️ How to Run Locally

1. **Open the project folder:**

   ```bash
   cd Library-Management-System-main
   
2. **Configure the database:**
 - Check the database configuration in:
      src/main/resources/application.properties
 - The project currently expects:
      spring.datasource.url=jdbc:postgresql://localhost:5432/librarydb
      spring.datasource.username=postgres
      spring.datasource.password=Post@2304
3. **Build and run:**
 - Using Maven Wrapper on Windows:
      .\mvnw.cmd spring-boot:run
 - Or using Maven directly:
      mvn spring-boot:run
4. **Access the API:**
 - The API will be available at:
      http://localhost:8080
