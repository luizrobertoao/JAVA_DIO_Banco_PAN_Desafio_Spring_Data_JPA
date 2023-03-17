# Nome da aplicação: Catálogo de filmes.

## Descrição

API RESTfull Java para criar e consultar um catálogo de filmes.

### Principais funcionalidades

- Receber registro de filmes, nome dos seus diretores e da produtora.
- Apagar registros.
- Atualizar registros. 
- Entregar o catálogo de filmes registrados por diversas formas de consulta.

### Quem Consome

Usuário que deseja criar um catálogo de filmes e realizar consultas a esse catálogo.

### Pré-requisitos de tecnologias ou dependencias

- Java 11.
- Spring Boot Starter Parent
- Spring Boot Starter Data JPA
- Spring Boot Starter Validation
- Spring Boot Starter Web
- PostgreSQL
- Lombok

**Dependências pode ser vistas no arquivo pom.xml**

### Instruções para executar localmente

Para executar a aplicação é necessario os seguintes passos:\
1- clonar projeto do github com o comando: **git clone** \
2-Use esse link para o **clone**:
`https://github.com/luizrobertoao/JAVA_DIO_Banco_PAN_Desafio_Spring_Data_JPA` \
3- Crie um banco de dados PostgreSQL chamado catalogo_filmes.\
4- Rode a aplicação.\
5- Importe o arquivo **"endpoints.postman_collection.json"** (na raiz do projeto) para o Postman para visualizar e enviar requests via endpoints da API.