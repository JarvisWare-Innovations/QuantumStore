# QuantumStore

Bem-vindo à API de QuantumStore! Esta aplicação fornece uma solução robusta para gerenciar um sistema de comércio eletrônico, ideal para aprimorar o portfólio dos desenvolvedores envolvidos.

---

## 📋 **Índice**
1. [Sobre o Projeto](#sobre-o-projeto)
2. [Funcionalidades](#funcionalidades)
3. [Tecnologias Utilizadas](#tecnologias-utilizadas)
4. [Como Executar o Projeto](#como-executar-o-projeto)
5. [Estrutura das Rotas](#estrutura-das-rotas)
6. [Contribuição](#contribuição)
7. [Licença](#licença)
8. [Contato](#contato)

---

## 📌 **Sobre o Projeto**

Este projeto é uma API RESTful criada para fornecer funcionalidades essenciais para um e-commerce. O objetivo é aprimorar as habilidades dos desenvolvedores e enriquecer seus portfólios com um sistema bem estruturado e documentado.

---

## ⚙️ **Funcionalidades**
- **Autenticação de usuários** (login e logout)
- **Cadastro e gerenciamento** de produtos e categorias
- **Processamento de pedidos** e gerenciamento de carrinho de compras
- **Pagamentos integrados** com diferentes métodos
- **Relatórios financeiros** e estatísticas de vendas
- **Controle de estoque** com notificações automáticas

---

## 🛠️ **Tecnologias Utilizadas**
- **Java** com **Spring Boot**
- **MYSql** para banco de dados
- **JWT** para autenticação
- **Swagger** para documentação de API
- **Lombok** para reduzir a verbosidade do código

---

## 🚀 **Como Executar o Projeto**

### **Pré-requisitos**
- Java 17+
- Maven 3.8+
- MySQL configurado e rodando

### **Instalação e Execução**
1. Clone o repositório:
   ```bash
   git clone https://github.com/JarvisWare-Innovations/QuantumStore.git
   cd ecommerce-api

### **Configuração do `application.properties`**  
   Configure as variáveis de ambiente ou o arquivo `application.properties` com as seguintes informações:

2. Configure as variáveis de ambiente ou o arquivo `application.properties`:
   # Configuração do Banco de Dados MySQL
       spring.datasource.url=jdbc:postgresql://localhost:5432/ecommerce
       spring.datasource.username=seu_usuario
       spring.datasource.password=sua_senha
 
    # Configurações JPA
       spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
       spring.jpa.hibernate.ddl-auto=update
       spring.jpa.show-sql=true

    # Porta do servidor
      server.port=8080
   
    # Limpar e compilar o projeto
      mvn clean install

# Executar o projeto usando o Spring Boot
mvn spring-boot:run

### **Acesse a documentação Swagger**  
Após executar o projeto, acesse a interface Swagger através do seguinte link:

http://localhost:8080/swagger-ui/index.html

### 📂**Estrutura das Rotas**

| Método | Rota                      | Descrição                      |
|--------|---------------------------|--------------------------------|
| GET    | `/products`               | Listar todos os produtos       |
| POST   | `/products`               | Adicionar um novo produto      |
| GET    | `/products/{id}`          | Buscar detalhes de um produto  |
| PUT    | `/products/{id}`          | Atualizar um produto existente |
| DELETE | `/products/{id}`          | Remover um produto             |
| GET    | `/users/{id}`             | Buscar informações de um usuário |
| POST   | `/orders`                 | Criar um novo pedido           |
| GET    | `/orders/{id}`            | Detalhar um pedido específico  |
| PUT    | `/orders/{id}`            | Atualizar o status de um pedido |
| DELETE | `/orders/{id}`            | Cancelar um pedido             |


### 🤝 **Contribuição**

Este é um projeto colaborativo focado no desenvolvimento e aprimoramento de portfólios. A equipe é incentivada a contribuir com melhorias, novas funcionalidades e sugestões para tornar o projeto mais robusto.

#### **Como Contribuir**  
1. Faça um fork do projeto:
   ```bash
   git clone https://github.com/NickRicardo/projeto-e-commerce.git

2. Crie uma nova branch para sua feature:
   ```bash
   git checkout -b feature/sua-feature
 

3. Faça as alterações necessárias e commit:
   ```bash
   git commit -m "Adiciona nova feature"

4. Envie suas alterações para o seu repositório fork:
    ```bash
    git push origin feature/sua-feature
5. Abra um Pull Request no repositório principal.

### 📜 **Licença**
Este projeto está sob a licença MIT. Para mais detalhes, consulte o arquivo LICENSE.

#### **Repositórios Colaborativos**
- [Carlos - KaduSR](https://github.com/KaduSR)  
- [Nick Ricardo - NickRicardo](https://github.com/NickRicardo)

Para sugestões ou dúvidas, entre em contato conosco por meio dos repositórios GitHub acima.

> **“Às vezes você tem que correr antes de aprender a andar.”**  
> — *Tony Stark*

















