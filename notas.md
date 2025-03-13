testes unitários com Junit 5 

o corpo do teste sempre será: @TEST
void "nomebemdescritivodoTeste"(){
    classe(a ser testada) condição
    Assertions. (colocar a exeução)
} 

📌 Maven em Testes Unitários
O Maven é uma ferramenta de automação de build e gerenciamento de dependências para projetos Java. No contexto de testes unitários, ele desempenha um papel crucial, garantindo que todas as bibliotecas necessárias estejam disponíveis e que os testes sejam executados corretamente.

Principais funções do Maven em testes unitários
Gerenciamento de dependências:

O Maven permite adicionar bibliotecas de testes, como JUnit e Mockito, de forma automática pelo arquivo pom.xml, sem precisar baixá-las manualmente.
Execução automatizada de testes:

O Maven usa o Surefire Plugin para rodar testes unitários (mvn test).
Também pode usar o Failsafe Plugin para testes de integração.
Padronização do ciclo de vida do projeto:

Quando você executa mvn test, o Maven segue etapas organizadas, como:
compile → Compila o código-fonte.
test-compile → Compila os testes.
test → Executa os testes unitários.
Relatórios e logs detalhados:

O Maven gera logs informando quais testes passaram/falharam e pode integrar ferramentas de cobertura de testes, como JaCoCo.

🔹 Comando para rodar os testes:
mvn test


📌 Mockito em Testes Unitários
O Mockito é uma biblioteca Java para criar mocks e stubs, ou seja, simular o comportamento de classes dependentes para testar um componente isoladamente.

Principais funções do Mockito
Simulação de dependências externas:

Se uma classe depende de um banco de dados ou API, você pode "enganá-la" criando um mock.
Verificação de chamadas de métodos:

Você pode verificar se um método foi chamado e com quais parâmetros.
Evita a necessidade de implementação real:

Reduz a complexidade e aumenta a velocidade dos testes, pois evita chamadas reais a serviços externos.


