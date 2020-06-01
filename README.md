# prova-api-update

<h2>Este projeto:</h2>

Projeto Java de aplicação dos conceitos e conhecimentos adquiridos durante a mentoria de backend, atualizando assim a forma como foi implementado e executado este mesmo projeto na sua entrega original.


<h2>Objetivos:</h2>

Este projeto realiza testes envolvendo o serviço ViaCEP para consultar o retorno de sua API. Validando assim os seguintes cenários:

1. Consulta por CEP válido.
2. Consulta por CEP inválido.
3. Consulta por CEP inexistente.
4. Consulta por logradouro de Av/Rua.


<h2>Tecnologias utilizadas:</h2>

- <i>JUnit 5 para execução dos casos de teste.</i>
- <i>RestAssured 4.3.0 para manipulação dos dados da API.</i>
- <i>Allure Reports 2.13.3 para geração dos relatórios.</i>


<h2>Padrões utilizados:</h2>

Neste projeto, todas as classes utilizadas para execução dos testes estão dentro do diretório <i>src/test/java</i> onde foi criado o package "testcases".

Os relatórios de cada execução serão armazenados dentro do diretório allure-reports, que será gerado a partir da primeira execução deste projeto.


<h2>Para executar a automação:</h2>

1) Este é um projeto gradle, portanto caso não possua a aplicação faça o <a href="https://gradle.org/install/">download</a> no site e siga os passos indicados no documento.
	
2) Aqui existem duas formas de carregar os arquivos no seu sistema :

	2.1) Clonar o repo via git, executar:
	
	  	git clone https://github.com/mcoradini/prova-api-update.git
		
	2.2) Ou faça o download do arquivo .zip e extraia o seu conteúdo em um diretório.
	
3) Importe o projeto na sua IDE.

4) Dentro da estrutura de <i>src/test/java</i> a partir do menu de contexto, selecione a opção <i>"Run Tests in br.com.coradini.testcases"</i>.
