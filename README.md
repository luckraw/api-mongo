# API Mongo

Este é um projeto de gerenciamento de estudantes que permite criar e listar estudantes. Ele utiliza uma arquitetura RESTful com Spring Boot e o banco de dados MongoDB para persistência.

### Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data MongoDB
- Gradle

### Como usar

- Para criar um novo estudante, faça uma solicitação HTTP POST para http://localhost:8080/v1 com um objeto StudentRequest no corpo da solicitação.

Exemplo de corpo da solicitação:

```json
{
  "name": "Nome do Estudante",
  "birthDate": "2000-01-01",
  "document": "1234567890"
}
```

- Para obter uma lista de todos os estudantes, faça uma solicitação HTTP GET para `http://localhost:8080/v1`.

### Considerações Finais

Este projeto de gerenciamento de estudantes oferece funcionalidades básicas para criar e listar estudantes utilizando uma API RESTful. O uso do Spring Boot e do banco de dados MongoDB proporciona uma base sólida e escalável para o desenvolvimento e expansão contínua do projeto.


