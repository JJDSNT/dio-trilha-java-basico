# Projeto de Cálculo de Frete usando Strategy Pattern

Este projeto demonstra a implementação do [Pattern Strategy](https://refactoring.guru/pt-br/design-patterns/strategy) para resolver um problema de cálculo de frete em um sistema de e-commerce.

## Cenário

Um sistema de e-commerce onde diferentes métodos de entrega (Correios, transportadora, retirada na loja, etc.) têm cálculos de frete distintos.

## Objetivo

Criar um serviço de cálculo de frete que, com base no tipo de entrega selecionado, utilize uma estratégia específica para calcular o valor do frete.

## Implementações Concretas

- **CorreiosFreteStrategy**: Implementa a lógica específica para calcular o frete usando os Correios.
- **TransportadoraFreteStrategy**: Implementa a lógica específica para calcular o frete usando uma transportadora.
- **RetiradaLojaFreteStrategy**: Implementa a lógica específica para calcular o frete quando o cliente opta por retirar na loja.

Cada classe implementa a lógica específica de cálculo para o método de entrega correspondente.

## Endpoints

### `POST /pedido/calcular-frete`

Calcula o valor do frete com base no tipo de entrega selecionado.

- **Request**:
  - **Body**: Um objeto JSON representando o pedido. Exemplo:
    ```json
    {
      "peso": 2.5,
      "dimensoes": {
        "altura": 10,
        "largura": 15,
        "profundidade": 20
      },
      "destino": "São Paulo, SP"
    }
    ```
  - **Query Parameter**: `tipoFrete` - O tipo de frete a ser utilizado. Exemplo: `CorreiosFreteStrategy`.

- **Response**:
  - **Status 200**: Retorna o valor calculado do frete.
    ```json
    {
      "valorFrete": 25.00
    }
    ```
  - **Status 400**: Retorna um erro caso o tipo de frete não seja suportado ou se houver algum problema com os dados do pedido.
    ```json
    {
      "erro": "Tipo de frete desconhecido"
    }
    ```

## Documentação da API

A documentação da API pode ser visualizada através do Swagger UI. Acesse o Swagger UI em:

- [Swagger UI](http://localhost:8080/swagger-ui/index.html)

## Benefícios

- **Flexibilidade**: É fácil adicionar novos métodos de entrega sem modificar o código existente.
- **Responsabilidade única**: Cada classe de estratégia é responsável por um único tipo de cálculo.

Essa abordagem não apenas demonstra o uso do Pattern Strategy, mas também se alinha bem com os princípios SOLID, especialmente o princípio de aberto/fechado e responsabilidade única.
