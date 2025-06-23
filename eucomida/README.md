# euComida Backend

Projeto backend para o sistema de pedidos "euComida", concorrente do iFood. Desenvolvido com Java 17, Spring Boot, JWT e PostgreSQL. Containerizado com Docker.

## Tecnologias
- Java 17
- Spring Boot 3
- Spring Security + JWT
- PostgreSQL
- Docker e Docker Compose
- Swagger/OpenAPI

## Como Rodar

1. Gere o `.jar`: `./mvnw clean package`
2. Inicie com Docker: `docker-compose up --build`

A API estará disponível em `http://localhost:8080`.

## Endpoints

- `POST /auth/login`: Autentica e retorna o token JWT.
- `POST /pedidos`: Cria novo pedido.
- `GET /pedidos/{id}`: Consulta o status do pedido.

## Documentação da API

Acesse via Swagger em `http://localhost:8080/swagger-ui.html`.

## Segurança

- Todas as rotas são protegidas por JWT, exceto `/auth/login`.
- Senhas armazenadas com BCrypt.

