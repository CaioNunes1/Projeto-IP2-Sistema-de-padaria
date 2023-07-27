# Sistema de Padaria

## Integrantes do grupo:
- Caio Gabriel Nunes de Lima - gabrielnunesdelima2003@gmail.com
- Felipe Pereira Reis - felipepereirareis2104@gmail.com
- João Victor Morais Barreto da Silva - joaovictor8454@gmail.com
- Ramon Artur Vilela de Oliveira - ramonvilela92@hotmail.com

## Descrição:
O Sistema de Padaria é uma aplicação web projetada para facilitar a gestão e operação de uma padaria. O sistema oferece recursos de controle de acesso, venda de produtos, gerenciamento de produtos e gerenciamento de funcionários, atendendo às necessidades tanto dos funcionários da padaria quanto dos administradores.

### Perguntas e Respostas:

1. **Quem vai usar o programa?**
   - Funcionários e administradores da empresa.

<br>

2. **Que serviços são importantes para os usuários?**
   - Cadastro de itens no estoque
   -  registro de vendas
   -  registro de despesas e etc

<br>

3. **Qual a principal funcionalidade do seu sistema?**
   - Registrar e gerenciar vendas e estoque de produtos de uma padaria.

<br>

4. **Quais serviços cada usuário pode executar?**
   - Funcionários podem:
     - Registrar vendas.
     - Cadastrar produtos no estoque.


   - Administradores:
     - Gerenciar funcionários da empresa (adicionar, editar, remover).
     - Visualizar relatório de vendas dos produtos, com informações de quantidade vendida e lucro obtido.

# Requisitos:

**REQ1 - Controle de Acesso:**

   - O sistema deve controlar o acesso através de login e senha. Os usuários do sistema serão do tipo administrador e funcionário.

<br>

**REQ2 - Venda de Produtos e Histórico:**

  - O sistema deve permitir a venda de produtos previamente cadastrados e salvá-los como em um histórico de vendas, que poderá ser acessado por um usuário administrador.

<br>

**REQ3 - Relatório de Vendas dos Produtos:**

   -  O sistema deve permitir um relatório das vendas de cada produto vendido, informando a quantidade vendida, o valor de lucro obtido, classificação dos produtos mais vendidos e os produtos que mais geraram lucro. Essa ação só pode ser realizada por um usuário administrador.

<br>

**REQ4 - Gerenciamento de Produtos:**

   - O sistema deve permitir o gerenciamento (Create, Recover, Update e Delete - CRUD) de produtos e essa ação pode ser feita por funcionários comuns.

<br>

**REQ5 - Gerenciamento de Funcionários:**

   - O sistema deve permitir o gerenciamento (CRUD) de funcionários da empresa e essa ação somente poderá ser executada por usuários administradores. Usuários administradores também podem executar todas as funcionalidades que um funcionário comum pode executar.
