# 📋 User API REST

API RESTful para gerenciamento de usuários, desenvolvida com **Spring Boot**, **Java 17** e **PostgreSQL**.

---

## 🚀 Tecnologias Utilizadas

| Tecnologia | Versão | Finalidade |
|---|---|---|
| Java | 17 | Linguagem principal |
| Spring Boot | 3.x | Framework backend |
| Spring Data JPA | - | Persistência de dados |
| PostgreSQL | - | Banco de dados relacional |
| Maven | - | Gerenciador de dependências |

---

## 🏗️ Arquitetura do Projeto
```
src/
└── main/
    └── java/com/anacaroline/userapi/
        ├── controller/     → Recebe as requisições HTTP
        ├── service/        → Regras de negócio
        ├── repository/     → Comunicação com o banco de dados
        └── model/          → Entidades / Modelos de dados
```

---

## 📡 Endpoints da API

Base URL: `http://localhost:8080`

| Método | Endpoint | Descrição |
|---|---|---|
| `POST` | `/users` | Cria um novo usuário |
| `GET` | `/users` | Lista todos os usuários |
| `GET` | `/users/{id}` | Busca usuário por ID |
| `PUT` | `/users/{id}` | Atualiza um usuário |
| `DELETE` | `/users/{id}` | Remove um usuário |

---

## ⚙️ Como Rodar o Projeto
```bash
git clone https://github.com/annakkarolyne/user-api-rest.git
cd user-api-rest
./mvnw spring-boot:run
```

---

## 📌 Próximas Melhorias

- [ ] Validações com `@NotBlank` e `@Email`
- [ ] Tratamento de erros personalizado
- [ ] Autenticação com JWT

---

## 👩‍💻 Autora

Feito com 💙 por **Ana Caroline**