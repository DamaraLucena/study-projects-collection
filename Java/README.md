# Introdução ao Spring Boot

## Diferença entre Spring Boot e Spring Framework

### Spring Boot
- Um framework que facilita a criação de aplicações Java baseadas no Spring Framework.
- Criação rápida e simples de aplicações, sem necessidade de extensas configurações.
- Suporte ao modo "Just Run".

### Spring Framework
- A base sobre a qual o Spring Boot é construído.
- Fornece uma estrutura completa para o desenvolvimento de aplicações Java.
- Inclui recursos como injeção de dependências, gerenciamento de transações e integração com outros frameworks.

## Criando a Primeira Aplicação Spring Boot

### Spring Initializer
- Ferramenta online para criação rápida de projetos Spring Boot.
- Configuração das dependências iniciais, gerenciador de dependências (Maven ou Gradle), e linguagem (Java, Kotlin, Groovy).

### Estrutura do Projeto
- `pom.xml`: Arquivo de configuração do Maven.
- `src/main/java`: Classes Java da aplicação.
- `src/main/resources`: Arquivos de configuração, templates e recursos estáticos.
- `src/test/java`: Classes de teste unitário.

### Configurações da Aplicação
- **FirstSpringAppApplication**: Classe principal que inicializa o contexto Spring.
- `application.properties`: Define configurações da aplicação (e.g., `server.port`, `spring.datasource`, `spring.jpa`).

## Configurações Adicionais

### Anotações
- `@Configuration`: Classe de configuração que define beans personalizados.
- `@Bean`: Declara métodos que criam objetos gerenciados pelo Spring.
- `@RequestBody`: Mapeia o corpo da requisição HTTP para um parâmetro no controller.
- `@PathVariable`: Mapeia uma variável na URL para um parâmetro do método do controller.
- `@RequestParam`: Mapeia parâmetros de consulta na URL para o método do controller.

## APIs Stateless e Stateful

### APIs Stateless
- **Definição**: Não armazena o estado do cliente entre requisições.
- **Vantagens**: Escalabilidade, simplicidade, tolerância a falhas.
- **Exemplo**: APIs RESTful.

### APIs Stateful
- **Definição**: Mantém o estado do cliente entre requisições.
- **Vantagens**: Experiência de usuário fluida, funcionalidades avançadas.
- **Desvantagens**: Complexidade, desafios de escalabilidade.
- **Exemplo**: Sessões de login.

## Criando um Service

### Anotação `@Service`
- Define uma classe como serviço, responsável pela lógica de negócio.
- Injetável nos controllers para separação de responsabilidades.

### Injeção de Dependência no Service
- Permite que um service receba dependências como outros serviços ou repositórios via construtor ou `@Autowired`.

## Criando um Controller REST

### Anotação `@RestController`
- Define a classe como um controller REST, combinando `@Controller` e `@ResponseBody`.
- Responsável por receber requisições HTTP e retornar respostas em JSON.

### Anotação `@RequestMapping`
- Mapeia endpoints HTTP para métodos do controller, definindo o método HTTP e o caminho do endpoint.

### Injeção de Dependência
- O Spring permite a injeção de dependências para evitar a necessidade de instanciar objetos manualmente, via construtor ou `@Autowired`.
```