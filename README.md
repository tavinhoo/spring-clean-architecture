# Projeto Clean Architecture Example

Este é um exemplo de projeto que foi refatorado para seguir os princípios da Clean Architecture. Inicialmente, o projeto estava estruturado em camadas convencionais, mas foi refatorado para seguir uma arquitetura mais modular e independente de frameworks.

## Objetivo

O objetivo deste projeto é demonstrar como estruturar um sistema seguindo os princípios da Clean Architecture, promovendo a separação de preocupações e facilitando a manutenção, teste e evolução do software.

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- PostgreSQL
- JUnit

## Estrutura do Projeto

O projeto foi organizado em módulos que refletem as diferentes camadas da Clean Architecture:

1. **Domain**: Contém as entidades de domínio e regras de negócio do sistema. Esta camada é o núcleo da aplicação e não deve depender de nenhum framework externo.

2. **Use Cases**: Aqui são definidos os casos de uso da aplicação, que representam as principais funcionalidades do sistema. Cada caso de uso é implementado como um serviço de aplicação independente.

3. **Adapters**: Esta camada é responsável por adaptar os detalhes técnicos do sistema para os formatos e protocolos necessários. Inclui adaptadores para frameworks, como o Spring Boot, e para o banco de dados.

4. **Frameworks & Drivers**: Nesta camada, são incluídos os detalhes técnicos relacionados ao framework utilizado, como configurações do Spring Boot e controladores REST.

## Dependências

O projeto utiliza as seguintes dependências:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```
## Como Executar
Para executar o projeto, siga estas etapas:

1. Certifique-se de ter o PostgreSQL instalado e em execução na sua máquina.
2. Clone este repositório para o seu ambiente local.
3. Configure as propriedades do banco de dados no arquivo application.properties.
4. Execute a aplicação usando sua IDE ou execute o comando mvn spring-boot:run na raiz do projeto.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para fazer um fork do projeto, implementar melhorias e enviar um pull request.

Licença
Este projeto está licenciado sob a Licença MIT.

