## Event Tracker

#### Week 12 Homework for Skill Distillery

### Overview

> This project allows you track all your subscriptions. There is a renewal date where you place your next payment and a cost so you can keep track of the ammount of that subscription.

### **Table of REST endpoints**

| **HTTP Verb** | **URI**                 | **Request Body**                                              | **Response Body**                           | **Purpose**                         |
| ------------- | ----------------------- | ------------------------------------------------------------- | ------------------------------------------- | ----------------------------------- |
| **GET**       | /api/subscriptions      |                                                               | Collection of all _subscription entries_    | **List** or **Collection** endpoint |
| **GET**       | /api/subscriptions/{id} |                                                               | Representation of entry at id number-- {id} | **Retrieve** endpoint               |
| **POST**      | /api/subscriptions      | Representation of new _subscription_ entry                    | Description of the result of the operation  | **Create** endpoint                 |
| **PUT**       | api/subscriptions/{id}  | Representation of a _new version_ of entry at id number--{id} |                                             | **Replace** endpoint                |
| **PATCH**     | api/subscriptions/{id}  | Description of changes to make to entry at id number--{id}    |                                             | **Update** endpoint                 |
| **DELETE**    | api/subscriptions/{id}  |                                                               |                                             | **Delete** route                    |

### How to Use

- Basic CRUD operations implemented and front end implementation will be coming soon

### Technologies Used

- Java
- Spring REST
- Spring Boot
- JPA
- MySQL
- Gradle
- JSON
- Postman
- AWS

### Lessons Learned

- How to use Spring REST for CRUD operations and Http Servlets for response and request notifications.
