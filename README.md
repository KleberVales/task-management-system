# 📝 Task Management System (To-Do List)

This project is a backend application developed in Java with Spring Boot, which implements a task management system with CRUD, authentication, and authorization functionalities.

---

## 🚀 Features

- **Create tasks**: add new tasks with a title and description.
- **List tasks**: view all registered tasks.
- **Update tasks**: edit information for an existing task.
- **Delete tasks**: remove tasks from the system.
- **Authentication and authorization**: access control with **Spring Security**.

---

## 🛠️ Technologies used

- **Java 21**
- **Spring Boot**
- **Spring MVC** (for HTTP requests)
- **Spring Data JPA** (persistence and database integration)
- **Spring Security** (authentication and authorization)
- **Database:** PostgreSQL or MySQL
- **Maven** (dependency management)

---

## 📂 Project Structure

```text

src/
├── main/
│   ├── java/com/seuprojeto/todolist/
│   │   ├── controller/   # Controladores REST
│   │   ├── model/        # Entidades JPA
│   │   ├── repository/   # Interfaces de acesso ao banco
│   │   ├── service/      # Regras de negócio
│   │   └── security/     # Configurações de autenticação/autorização
│   └── resources/
│       ├── application.properties   # Configurações do projeto
│       └── schema.sql  / data.sql    # Scripts do banco (opcional)

```
