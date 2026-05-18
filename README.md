# 📚 Library Management System API

A robust and scalable RESTful API built with **Spring Boot** and **Java** for managing a library's operations. This system handles the core entities of a library: Books, Authors, Categories, and Users, providing a seamless backend for library management applications.

## 🚀 Features

- **Book Management:** Add, update, delete, and retrieve book details.
- **Author Management:** Manage author profiles and link them to their books.
- **Category Management:** Organize books into various categories for easy discovery.
- **User Management:** Register and manage library users.
- **Relational Database Mapping:** Utilizes Spring Data JPA / Hibernate for robust database interactions and entity relationships.

## 🛠️ Technology Stack

- **Java** (JDK 17+)
- **Spring Boot** (REST API Framework)
- **Spring Data JPA** (ORM / Database interactions)
- **Hibernate** (JPA Implementation)
- **Maven** (Dependency Management)
- **Database** (Configured via `application.properties`)
- **Lombok** (Boilerplate code reduction)

## ⚙️ Prerequisites

Before you begin, ensure you have met the following requirements:
- Java Development Kit (JDK) installed (version 17 or higher recommended).
- Maven installed.
- Your preferred SQL Database running (if not using an in-memory DB like H2).
- IDE (Eclipse, IntelliJ IDEA, or VS Code).

## 🏃‍♂️ How to Run Locally

1. **Clone the repository:**
   ```bash
   git clone <your-repository-url>
   cd Library-Managemen-API
   ```

2. **Configure Database:**
   Update the database configuration in `src/main/resources/application.properties` with your specific database URL, username, and password.

3. **Build and Run:**
   You can run the application using Maven:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
   Or, run the main application class directly from your IDE.

4. **Access the API:**
   The API will be available at: `http://localhost:8080`

## 📌 API Endpoints Overview

Here are the primary entity endpoints available in this system:

*   **Books:** `/api/books` (GET, POST, PUT, DELETE)
*   **Authors:** `/api/authors` (GET, POST, PUT, DELETE)
*   **Categories:** `/api/categories` (GET, POST, PUT, DELETE)
*   **Users:** `/api/users` (GET, POST, PUT, DELETE)

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!
