# Jokenpo
Jokenpo Implementation

### Resolução:
A aplicação recebe uma requisição por meio do método GET com um HeaderParam de nome "playerChoice" que deve conter um dos valores "ROCK", "PAPER", ou "SCISSORS".
Após isso é retornado qual foi a escolha do computador e o resultado da partida.


### Requisitos: 

#### - JRE

>Como obter no Linux:
`# sudo apt install default-jre`

>Como obter no Windows: 
`https://www.java.com/pt-BR/download/manual.jsp`


### Execução: 
##### Por meio da IDE: 
  basta clonar o projeto (ou extrair o arquivo "jokenpo-technical-challenge.zip" enviado via Greehouse) e importa-lo dentro da sua IDE de preferência. Após isso, basta executar a classe "ZenviaTechnicalChallengeApplication.java"
##### Por meio do arquivo "jokenpo-zenvia-technical-challenge.jar" (Enviado via Greenhouse):
  basta entrar no diretório onde está localizado o arquivo e executar o comando `java -jar jokenpo-zenvia-technical-challenge.jar`

### Utilização:

#### Via Swagger:

A aplicação possui o swagger integrado. Com a aplicação em execução basta acessar "http://localhost:8080/swagger-ui.html" 

#### Via API Client:  
Basta realizar uma requisição utilizando o verbo GET para url "http://localhost:8080/jokenpo/play" passando obrigatoriamente o header parameter "playerChoice" com um dos valores "ROCK", "PAPER", "SCISSORS". obs.: Os valores não são case sensitive, porém, a chave sim. 
