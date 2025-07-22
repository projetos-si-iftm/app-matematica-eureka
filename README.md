# 🛰️ App Ensino Matemática - Eureka Server · Socratic
Este repositório contém o Eureka Server do Socratic, um aplicativo educacional de matemática voltado para a comunidade externa.

O Eureka atua como service discovery da aplicação, permitindo que os microsserviços se registrem dinamicamente e descubram uns aos outros, promovendo escalabilidade, desacoplamento e resiliência na arquitetura do sistema.

# ⚙️ Funções do Eureka no projeto
- Registro automático de microsserviços (usuarios, respostas, questões etc.);

- Roteamento inteligente por meio da integração com o Spring Cloud Gateway;

- Atualização em tempo real da disponibilidade de instâncias registradas;

- Facilita o balanceamento de carga entre serviços em ambientes distribuídos.

# 🧭 Sumário
- [Contribuidores](#contribuidores)
- [Microsserviços conectados](#microsserviços-conectados)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Configuração do Ambiente](#configuração-do-ambiente)
- [Execução do Projeto](#execução-do-projeto)
- [Licença](#licença)

# Contribuidores

- [@fromanoel](https://github.com/fromanoel) – Backend: desenvolvimento e integração dos microsserviços, configuração do Gateway e do Eureka Server, e organização da documentação com Swagger.
- [@madu-silva](https://github.com/madu-silva) – Backend: integração com Firebase, geração do token JWT.
- [IsabelaQM](https://github.com/IsabelaQM) – Frontend: desenvolvimento da aplicação em React e React Native.
- [@samylledutra](https://github.com/samylledutra) – Frontend: desenvolvimento da aplicação em React e React Native.
- [@stclaire1](https://github.com/stclaire1) – Frontend: desenvolvimento da aplicação em React e React Native.

# 🔗 Microsserviços conectados
Os seguintes serviços se registram no Eureka:

👉 [Backend - Usuários](https://github.com/projetos-si-iftm/app-matematica-backend)
Gerenciamento de alunos, professores e turmas, além da autenticação com Firebase e geração de JWT.

👉 [Backend - Questões](https://github.com/projetos-si-iftm/app-matematica-backend-questao)
Gerenciamento do banco de questões de matemática.

👉 [Backend - Respostas](https://github.com/projetos-si-iftm/app-matematica-backend-resposta)
Gerenciamento das rodadas de respostas realizadas pelos alunos e do ranking.

👉 [Gateway API](https://github.com/projetos-si-iftm/app-matematica-backend-gateway)
Roteador central de requisições, responsável por validação JWT e encaminhamento para os serviços apropriados.

# 🛠️ Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Cloud Netflix Eureka Server
- Maven

# 🖥️ Configuração do Ambiente

## Clone o repositório
```bash
git clone https://github.com/projetos-si-iftm/app-matematica-eureka.git
cd app-matematica-eureka
```
## Compile e execute com Maven:
```bash
mvn clean install
mvn spring-boot:run
```

## Após iniciar, o Eureka Server estará disponível em:
```bash
http://localhost:8761
```

# 📜 Licença
Este projeto está licenciado sob a Licença Apache 2.0.
Veja o arquivo LICENSE para mais detalhes.
