# Task Manager Microservices

A microservices-based task management application built with **Spring Boot**, **Docker**, and **RabbitMQ**. This project demonstrates a modular and scalable approach to task management, with services for authentication, task operations, notifications, and auditing.

## Key Components

- **Auth Service**: Handles user registration and JWT-based authentication.
- **Task Service**: Provides CRUD operations for managing tasks.
- **Notification Service**: Sends notifications (e.g., email) to users upon task creation or status changes.
- **Audit Service**: Tracks and stores changes in tasks for auditing and logging purposes.

## Features

- **User Authentication**: JWT-based authentication for secure access.
- **Task Management**: Create, read, update, and delete tasks with status and due date management.
- **Event-Driven Notifications**: Send notifications asynchronously via RabbitMQ when task events occur.
- **Audit Logs**: Record task changes for tracking purposes.

## Technologies

- **Spring Boot**: Backend framework for building REST APIs.
- **RabbitMQ**: Message broker for event-driven communication between microservices.
- **Docker**: Containerization of microservices for easy deployment and scaling.
- **Spring Data JPA**: ORM for data storage with PostgreSQL or H2.
- **Spring Security + JWT**: For secure user authentication and authorization.
- **Zipkin/Jaeger** (optional): Distributed tracing for monitoring requests across microservices.

## Prerequisites

Before running the project, ensure you have the following installed:

- **Docker** and **Docker Compose**: For running the services in containers.
- **Java 17** or later: For building and running the Spring Boot applications.

## Running the Project

To get started with this project, follow these steps:

1. **Clone the repository**:

   ```bash
   git clone https://github.com/yourusername/task-manager-microservices.git
   cd task-manager-microservices
