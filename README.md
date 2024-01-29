# Sistema de Pedidos em Java

## Descrição
Este projeto em Java implementa um sistema simples de pedidos, onde você pode registrar clientes, criar pedidos e adicionar itens aos pedidos. O sistema utiliza conceitos de programação orientada a objetos (POO) para organizar as entidades principais, como `Client`, `Order`, `OrderItem`, e `Product`.

![diagrama_classes](https://github.com/rodri-oliveira/pedidos-java-oo/assets/44854361/2b40d973-1039-42a3-aae6-70da4c271438)

## Estrutura do Projeto

### Classes Principais

#### Client
A classe `Client` representa um cliente e armazena informações como nome, e-mail e data de nascimento.

#### Product
A classe `Product` representa um produto com atributos como nome e preço.

#### OrderItem
A classe `OrderItem` representa um item específico em um pedido, relacionando um produto à quantidade desejada.

#### Order
A classe `Order` representa um pedido feito por um cliente, contendo uma lista de itens (`OrderItem`). Cada pedido possui um status (`OrderStatus`).

### Enumerações

#### OrderStatus
A enumeração `OrderStatus` representa os possíveis status de um pedido, como "PENDENTE", "PROCESSANDO", "ENVIADO" etc.

## Como Utilizar

1. Clone este repositório: `git@github.com:rodri-oliveira/pedidos-java-oo.git`
2. Abra o projeto em sua IDE favorita (por exemplo, Eclipse, IntelliJ).
3. Execute o arquivo principal (`Program.java`) para interagir com o sistema.

## Funcionalidades

- **Cadastro de Clientes:** O usuário pode cadastrar novos clientes, fornecendo nome, e-mail e data de nascimento.

- **Criação de Pedidos:** É possível criar novos pedidos, especificando o status do pedido.

- **Adição de Itens ao Pedido:** O sistema permite adicionar itens aos pedidos, informando o nome do produto, preço e quantidade.

## Exemplo de Uso

Ao executar o programa, você será solicitado a inserir dados de cliente, criar um pedido e adicionar itens a ele. O resultado será exibido na saída padrão(console).

## Contribuição
Sinta-se à vontade para contribuir com melhorias ou corrigir possíveis problemas. Crie um fork do projeto, faça as alterações desejadas e envie um pull request.

## Licença
Este projeto é distribuído sob a licença [MIT](link-da-licenca).
