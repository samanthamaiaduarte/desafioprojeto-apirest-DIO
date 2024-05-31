##



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
