## Testes com JUnit 5, Mockito e Spring Boot (REST APIs)
Este repositório contém o código desenvolvido durante o curso "Testes com JUnit 5, Mockito e Spring Boot (REST APIs)" na plataforma Udemy. O objetivo deste curso é fornecer uma introdução abrangente aos testes de unidade e testes de integração usando JUnit 5, Mockito, Spring Boot e Docker, com ênfase em desenvolvimento de APIs REST.

## Conteúdo do Curso

### O curso abrange os seguintes tópicos principais:

- Introdução aos testes de unidade e sua importância no desenvolvimento de software.
- Visão geral do JUnit 5 e configuração do ambiente de teste.
- Testando classes de serviço e repositório com JUnit 5.
- Utilizando o Mockito para criar mocks e simular comportamentos em testes de unidade.
- Testando controladores de API REST com o Spring Boot Test.
- Testando integrações entre componentes com o Docker e testes de integração.
  Cobertura de código e geração de relatórios de testes.
### Requisitos
Para acompanhar o curso e executar o código deste repositório, você precisará ter o seguinte ambiente configurado em sua máquina:

* Docker instalado em sua máquina.
* Projeto Spring versão release com as seguintes dependências:
* Lombok (Opcional)
* Validation (Obrigatório)
* Spring Web (Obrigatório)
* PostgreSQL Driver (Obrigatório)
* Spring Data JPA (Obrigatório)
* Maven ou Gradle

Como utilizar este repositório
Clone este repositório em sua máquina local usando o seguinte comando:

```bash
git clone <URL_DO_REPOSITÓRIO>
```


Navegue até o diretório clonado:

```bash
cd testes-junit5-mockito-springboot
```

Abra o projeto em sua IDE de preferência.

Explore os pacotes e classes do projeto para entender os exemplos de testes apresentados no curso.

Execute os testes utilizando a IDE ou utilizando os comandos de build disponíveis para o Maven ou Gradle.

### Passos para a Configuração

##### 1. Criar um novo projeto Spring Initializr

   Vá para https://start.spring.io/ e crie um novo projeto com as dependências mencionadas acima.

##### 2. Baixar a imagem do PostgreSQL

```shell
   docker pull postgres
```

##### 3. Rodar a imagem do PostgreSQL

```shell
   docker run --name same-postgres -p 5432:5432 -e POSTGRES_PASSWORD=postgres -d postgres
```

## Nota

Certifique-se de substituir same-postgres pelo nome do seu container e postgres pela sua senha.

Agora, sua instância do PostgreSQL deve estar funcionando corretamente.
