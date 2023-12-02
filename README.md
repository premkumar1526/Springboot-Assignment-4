# ORM-Assignment-4
# Supermarket Order Management System
 
## Overview
 
This is a simple Supermarket Order Management System implemented using Spring Boot and Spring Data JPA. The system allows customers to place orders, and it provides functionality to view order details, calculate billing, and more.
 
## Project Structure
 
- **src/main/java/com/ozvithafernz/supermarket**: Contains the main Java source code.
  - **entity**: Entity classes representing the database entities (Customer, Order, Item).
  - **repository**: Spring Data JPA repositories for database access.
  - **service**: Business logic and services.
  - **controller**: REST controllers for handling HTTP requests.
- **src/main/resources**: Contains application properties and SQL scripts.
 
## Getting Started
 
1. Clone the repository: https://github.com/PaviG128/ORM-Assignment-4.git
 
   git clone https://github.com/PaviG128/ORM-Assignment-4.git
   
2. Build the project:
 
   ./mvnw clean install
   
3. Run the application:
 
   ./mvnw spring-boot:run
   
The application will be accessible at `http://localhost:8080`.
 
## API Endpoints
 
- **GET /api/orders/{orderId}**: Retrieve details for a specific order.
- **GET /api/orders/customer/{customerId}**: Retrieve orders for a specific customer.
- **POST /api/orders/create**: Create a new order.
- **PUT /api/orders/update/{orderId}**: Update an existing order.
- **DELETE /api/orders/delete/{orderId}**: Delete an order.
 
## Configuration
 
- Database configurations, application properties, and other settings can be modified in `src/main/resources/application.properties`.
 
