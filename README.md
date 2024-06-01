## DIO - Backend with Java 2024 - Project Challenge

### Challenge
The aim of this hands-on practical project is to create a RESTful API using Java 17 and Spring Boot 3.

#### Main technologies
- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database**

#### Class Diagram
``` mermaid
classDiagram
    class User {
        -Integer id
        -String name
        -Account account
        -Card card
        -Feature[] features
        -News[] news
    }

    class Account {
        -Integer id
        -String number
        -String agency
        -BigDecimal balance
        -BigDecimal limit
    }

    class Card {
        -Integer id
        -String number
        -BigDecimal limit
    }

    class Feature {
        -Integer id
        -String icon
        -String description
    }

    class News {
        -Integer id
        -String icon
        -String description
    }

    User "1" *-- "1" Account
    User "1" *-- "1" Card
    User "1" *-- "1..*" Feature
    User "1" *-- "1..*" News
```

##### [User JSON](https://github.com/samanthamaiaduarte/desafio-bootcamp-DIO/blob/main/assets/User.json)
