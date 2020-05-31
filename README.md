# prova-api-update

<h2>Objetivos</h2>

Este projeto realiza testes envolvendo o serviço ViaCEP para consultar o retorno de sua API. Avaliando assim os seguintes cenários:

1. Consulta por CEP válido.
2. Consulta por CEP inválido.
3. Consulta por CEP inexistente.
4. Consulta por logradouro de Av/Rua.


<h2>Ferramentas utilizadas:</h2>

- <i>JUnit5 para execução dos casos de teste.</i>
- <i>RestAssured para manipulação dos dados da API.</i>
- <i>Extent Reports para geração dos relatórios.</i>


<h2>Para executar a automação:</h2>

1) Este é um projeto gradle, portanto caso não possua a aplicação faça o <a href="https://gradle.org/install/">download</a> no site e siga os passos indicados no documento.
	
2) Aqui existem duas formas de carregar os arquivos no seu sistema :

	2.1) Clonar o repo via git, executar:
	
	  	git clone https://github.com/mcoradini/prova_sicredi_api.git
		
	2.2) Ou faça o download do arquivo .zip e extraia o seu conteúdo em um diretório.
	
3) Importe o projeto na sua IDE.
