**Projeto de Controle de Fluxo**
<br>
Este projeto foi desenvolvido como parte do bootcamp da DIO (Digital Innovation One) em Java, com o objetivo de explorar cenários envolvendo fluxos condicionais, loops e exceções. O projeto final consiste em um pequeno sistema de contador.

**Desafio de Controle de Fluxo**
<br>
No desafio de controle de fluxo, implementamos um sistema que recebe dois parâmetros via terminal, representando dois números inteiros. Com base nesses números, o sistema determina a quantidade de iterações (usando um loop for) e imprime os números incrementados no console. Por exemplo:
<br>
Se você inserir os números 12 e 30, o sistema fará um loop com 18 iterações, imprimindo os números de 1 a 18 no console, como "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
Além disso, o sistema inclui um tratamento de exceção personalizado. Se o primeiro parâmetro for MAIOR que o segundo, será lançada uma exceção customizada chamada ParametrosInvalidosException com a mensagem "O segundo parâmetro deve ser maior que o primeiro".

**Estrutura do Projeto**
<br>
O projeto está organizado na pasta DesafioControleFluxo.
A classe principal é Contador.java, que contém a lógica principal do sistema.
A classe ParametrosInvalidosException é uma exceção customizada utilizada para tratar parâmetros inválidos.
Como Executar
Para executar o projeto, siga estas etapas:
<br>
Abra o terminal.
Navegue até o diretório raiz do projeto.
Compile o arquivo Contador.java com o comando javac Contador.java.
Execute o programa com o comando java Contador.
Certifique-se de inserir os parâmetros necessários quando solicitado e observe o comportamento do sistema.
<br>
Este projeto serve como um exercício prático para consolidar os conceitos de controle de fluxo em Java, incluindo loops, tratamento de exceções e entrada de dados via terminal.




