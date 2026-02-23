# user-api-rest

API REST para gerenciamento de usuários feita com Java e Spring Boot.



---

## Tecnologias usadas

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven

---

## O que essa API faz

Operações básicas de cadastro de usuários (CRUD completo):

- Criar usuário
- Listar todos os usuários
- Buscar usuário por ID
- Atualizar usuário
- Deletar usuário

---

## Endpoints

| Método | Rota | O que faz |
|--------|------|-----------|
| POST | /users | Cria um novo usuário |
| GET | /users | Lista todos os usuários |
| GET | /users/{id} | Busca um usuário pelo ID |
| PUT | /users/{id} | Atualiza um usuário |
| DELETE | /users/{id} | Deleta um usuário |

---

## Como rodar o projeto

### Pré-requisitos
- Java 17 instalado
- PostgreSQL instalado
- Maven

### Passo a passo

1. Clone o repositório
```bash
git clone https://github.com/seuusuario/user-api-rest.git
```

2. Crie o banco de dados no PostgreSQL
```sql
CREATE DATABASE userapi;
```

3. Configure o arquivo `src/main/resources/application.properties` com suas credenciais
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/userapi
spring.datasource.username=postgres
spring.datasource.password=sua_senha
```

4. Rode o projeto
```bash
./mvnw spring-boot:run
```

5. Acesse em `http://localhost:8080`

---

## Exemplo de uso

Criando um usuário:
```json
POST /users
{
  "nome": "Ana Caroline",
  "email": "ana@email.com"
}
```


