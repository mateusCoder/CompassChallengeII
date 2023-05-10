# CompassChallengeII

<div align="center">
  <a href="https://www.java.com/pt-BR/" target="_blank" rel="noreferrer" rel="noopener">
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" alt="Java"/>
  </a>
  <a href="https://spring.io/" target="_blank" rel="noreferrer" rel="noopener">
    <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" alt="Spring"/>
  </a>
  <a href="https://git-scm.com/" target="_blank" rel="noreferrer" rel="noopener">
    <img src="https://img.shields.io/badge/Git-E34F26?style=for-the-badge&logo=git&logoColor=white" alt="Git"/>
  </a>
  <a href="https://www.microsoft.com/pt-br/windows/?r=1" target="_blank" rel="noreferrer" rel="noopener">
  <img src="https://img.shields.io/badge/Windows-017AD7?style=for-the-badge&logo=windows&logoColor=white" alt="Windows"/>
</div></br>



> O Compass Challenge é um desafio proposto para testar os conhecimentos em microserviços Spring boot.

## ⚙️ Funcionalidades

- [x] O Microserviço Product permite:
    - [x] Buscar produtos todos os produtos
    - [x] Buscar produtos informando:
    - Product ID
    - [x] Buscar produtos informando:
    - Preço minimo (min_price)
    - Preço máximo (max_price)
    - Query
    - [x] Cadastrar produtos informando:
    - Nome
    - Descrição
    - Preço
    - [x] Atualizar produtos informando:
    - Nome
    - Descrição
    - Preço
    - Product ID
    - [x] Delete produtos informando:
    - Product ID

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:

* Ter instalado a  linguagem `Java JDK 11 LTS`.
* Ter instalado a IDE `IntelliJIDEA` ou `Eclipse Spring`.
* Ter uma máquina `Windows 10` ou `11`.

## 🚀 Instalação

Passo-a-passo que informa o que você deve executar para ter um ambiente de desenvolvimento em execução.


><div align="center"> Clone do Projeto </div>
```
# Abra o terminal bash

# Clone este repositório
$ git clone https://github.com/mateusCoder/CompassChallengeII

```


><div align="center"> Executando a Aplicação </div>

```
# Abra a pasta ms-catalog e execute a aplicação em modo de desenvolvimento
# Abra a pasta ms-product e execute a aplicação em modo de desenvolvimento

# A aplicação ms-catalog será aberta na porta:9999 
# A aplicação ms-product-management será aberta na porta:8080 

```


## 📌 EndPoints

><div align="center"> Microserviço Catalog </div>

| HTTP   | EndPoint                             | Description                                               | Query                  |
|--------|--------------------------------------|-----------------------------------------------------------|------------------------|
| GET    | http://localhost:9999/products       | Lista todos os produtos cadastrados                       |                        |
| GET    | http://localhost:9999/products/{id}  | Detalha o cadastro de um pedido pelo ID                   |                        |
| GET    | http://localhost:9999/products/search| Lista produtos filtrados                                  |q, min_price, max_price |
| POST   | http://localhost:9999/products       | Cadastra um novo produto                                  |                        |
| PUT    | http://localhost:9999/products/{id}  | Atualiza o cadastro de um produto existente pelo ID       |                        |
| DELETE | http://localhost:9999/products/{id}  | Deleta o cadastro de um produto existente pelo ID         |                        |

><div align="center"> Microserviço Product </div>

| HTTP   | EndPoint                                                                    | Description                                               | Query                  |
|--------|-----------------------------------------------------------------------------|-----------------------------------------------------------|------------------------|
| GET    | http://localhost:8080/productInventory/productManagement/v1/products        | Lista todos os produtos cadastrados                       |                        |
| GET    | http://localhost:8080/productInventory/productManagement/v1/products/{id}   | Detalha o cadastro de um pedido pelo ID                   |                        |
| GET    | http://localhost:8080/productInventory/productManagement/v1/products/search | Lista produtos filtrados                                  |q, min_price, max_price |
| POST   | http://localhost:8080/productInventory/productManagement/v1/products        | Cadastra um novo produto                                  |                        |
| PUT    | http://localhost:8080/productInventory/productManagement/v1/products/{id}   | Atualiza o cadastro de um produto existente pelo ID       |                        |
| DELETE | http://localhost:8080/productInventory/productManagement/v1/products/{id}   | Deleta o cadastro de um produto existente pelo ID         |                        |


## 🕷️ Testes
Foram usadas as seguintes tecnologias e ferramentas para Testes da API:
* [JUnit 5](https://junit.org/junit5/docs/current/user-guide/) - Framework de Testes
* [Mockito](https://site.mockito.org/) - Estrutura de Testes

## 🚧🛠️ Tecnologias e Ferramentas

Foram usadas as seguintes tecnologias e ferramentas para a construção da API:
* [Git](https://git-scm.com/) - Ferramenta de Versionamento de Código
* [Java](https://www.java.com/pt-BR/) - Linguagem de Programação
* [SpringBoot](https://spring.io/) - FrameWork Java
* [H2](https://www.h2database.com/html/main.html) - Banco de Dados para Testes Unitários e de Integração
* [Open Feign](https://docs.spring.io/spring-cloud-openfeign/docs/current/reference/html/) - Integração síncrona
* [Postman](https://www.postman.com/) - Plataforma da API
* [IntelliJIDEA](https://www.jetbrains.com/pt-br/idea/) - IDE (Ambiente de desenvolvimento integrado)
* [Windows](https://www.microsoft.com/pt-br/windows/?r=1) - Sistema Operacional


## 👨‍💻 Desenvolvedor

<table align="center">
    <td align="center">
      <a href="https://github.com/mateusCoder">
        <img src="https://avatars.githubusercontent.com/u/76978080?v=4" width="100px;" alt="Foto do Mateus Cardoso"/><br>
        <sub>
          <div align="center">
            <b>Mateus Cardoso</b></br></br>
            <a href="https://www.linkedin.com/in/mateus-cardoso-de-moraes/" target="_blank" rel="noreferrer" rel="noopener">
              <img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white" alt="Linkedin"/>
            </a></br>
            <a href="mailto:mateus.moraes0507@gmail.com" target="_blank" rel="noreferrer" rel="noopener">
              <img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white" alt="Gmail"/></br>
            </a>
          </div>
        </sub>
      </a>
    </td>
</table>

## ❤️ Apoio

<sub>
  <div>
    <a href="https://compass.uol/pt/" target="_blank" rel="noreferrer" rel="noopener">
      <img src="https://github.com/mateusCoder/ReadMeTemplate/blob/main/compass.uol.png" alt="compass.uol" width="300px;"/><br>
    </a></br>
  </div>
</sub>
</br>

[⬆ Voltar ao topo](#CompassChallenge)<br>
