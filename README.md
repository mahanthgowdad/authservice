
# Authservice

**authservicex1** is a Spring Boot application designed to provide security features and authentication services. It utilizes Spring Security for access control, Spring Data JPA for database persistence, and integrates with MySQL.

## 🛠 Tech Stack

This project is built using the following technologies:

  * **Java 17**: The project is configured for Java SE 17.
  * **Spring Boot 3.5.7**: The core framework used for the application.
  * **Spring Security**: Handles authentication and authorization mechanisms.
  * **Spring Data JPA**: Abstraction for database interactions.
  * **MySQL**: The relational database management system used for storage.
  * **SpringDoc OpenAPI (Swagger)**: Automated API documentation and testing UI (v2.5.0).
  * **Maven**: Dependency management and build automation.

## 🚀 Getting Started

### Prerequisites

Ensure you have the following installed on your machine:

  * Java Development Kit (JDK) 17
  * MySQL Server

### Configuration

Before running the application, you must configure the database connection. As the `application.properties` file was not provided, you likely need to create one in `src/main/resources/application.properties` with your MySQL credentials:

```properties
spring.application.name=authservicex1
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA / Hibernate settings
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Installation & Running

1.  **Clone the repository:**

    ```bash
    git clone https://github.com/yourusername/authservicex1.git
    cd authservicex1
    ```

2.  **Build the project:**
    Use the included Maven Wrapper to ensure you are using the correct Maven version.

    ```bash
    # Linux/Mac
    ./mvnw clean install

    # Windows
    mvnw.cmd clean install
    ```

    [cite\_start][cite: 5, 71]

3.  **Run the application:**

    ```bash
    # Linux/Mac
    ./mvnw spring-boot:run

    # Windows
    mvnw.cmd spring-boot:run
    ```

## 📖 API Documentation

This project includes `springdoc-openapi-starter-webmvc-ui`. Once the application is running, you can access the interactive Swagger UI to test endpoints:

  * **Swagger UI:** `http://localhost:8080/swagger-ui/index.html`
  * **OpenAPI JSON:** `http://localhost:8080/v3/api-docs`

## 💻 Development

### Eclipse / Spring Tool Suite (STS)

[cite\_start]This project contains Eclipse configuration files (`.project`, `.classpath`)[cite: 2, 3]. You can import it directly:

1.  Open Eclipse/STS.
2.  Go to **File** -\> **Import** -\> **Existing Maven Projects**.
3.  Select the project directory.

### Project Structure

  * `src/main/java`: Source code.
  * `src/main/resources`: Configuration files.
  * `src/test/java`: Unit and integration tests (uses `spring-boot-starter-test`).


