# Spring Data Rest
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/WelingtonFranzoso/franzoso-agregador-de-investimentos/blob/main/LICENSE) 

# Sobre o projeto
Este projeto é uma aplicação CRUD. Ele utiliza o Spring Data REST para gerar automaticamente as operações CRUD, e o Swagger para fornecer uma documentação automatizada das rotas da API. A aplicação possui filtros personalizados e uma sobrecarga no método delete para garantir que a rota de deleção não seja exposta. O banco de dados utilizado foi o H2 para teste da aplicação.

# Funcionalidades
- CRUD Completo: Operações de criação, leitura, atualização e deleção de usuários.
- Filtros Personalizados: Busca de usuários por nome através de parâmetros na URL.
- Rota de Deleção Personalizada: Método de deleção sobrescrito para não expor a rota de deleção diretamente, melhorando a segurança da aplicação.
- Documentação Automática: A documentação da API é gerada automaticamente pelo Swagger, facilitando o entendimento das rotas.

# Tecnologias utilizadas
- Java: Linguagem de programação utilizada para o desenvolvimento.
- Spring Boot: Framework para construção da aplicação.
- Spring Data REST: Para a criação automática das rotas de API RESTful.
- Swagger: Para documentação automatizada das APIs.
- H2 Database: Banco de dados embutido, utilizado para fins de teste e desenvolvimento.

# Endpoints
## Os seguintes endpoints estão disponíveis para interagir com a aplicação:

- GET /users: Retorna todos os usuários cadastrados.
- GET /users/{id}: Retorna um usuário específico pelo ID.
- POST /users: Cria um novo usuário.
- PUT /users/{id}: Atualiza um usuário existente.
- DELETE /users/{id}: Deleta um usuário (não exposta diretamente, com método sobrescrito).
## Filtros Personalizados
- GET /users/search/findByName?name={nome}: Busca um usuário pelo nome.

# Como executar o projeto
## Back end
### Pré-requisitos: 
- Java 17 ou superior
- Maven (para construção do projeto)
- Swagger


```bash
# clonar repositório
git clone git@github.com:WelingtonFranzoso/spring-data-rest.git

# entrar na pasta do projeto back end
cd spring-data-rest

# executar o projeto
./mvnw spring-boot:run
```
# Acessando a Documentação Swagger
## A documentação da API pode ser acessada no seguinte endereço:

Swagger UI: http://localhost:8080/swagger-ui.html

# Autor

Welington Franzoso
https://www.linkedin.com/in/welington-franzoso-88a8301b9
