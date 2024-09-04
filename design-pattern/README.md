# Projeto de Cálculo de Frete usando Strategy Pattern

Este projeto demonstra a implementação do Pattern Strategy para resolver um problema de cálculo de frete em um sistema de e-commerce.

## Cenário

Um sistema de e-commerce onde diferentes métodos de entrega (Correios, transportadora, retirada na loja, etc.) têm cálculos de frete distintos.

## Objetivo

Criar um serviço de cálculo de frete que, com base no tipo de entrega selecionado, utilize uma estratégia específica para calcular o valor do frete.

## Implementações Concretas

- **CorreiosFreteStrategy**: Implementa a lógica específica para calcular o frete usando os Correios.
- **TransportadoraFreteStrategy**: Implementa a lógica específica para calcular o frete usando uma transportadora.
- **RetiradaLojaFreteStrategy**: Implementa a lógica específica para calcular o frete quando o cliente opta por retirar na loja.

Cada classe implementa a lógica específica de cálculo para o método de entrega correspondente.

## Benefícios

- **Flexibilidade**: É fácil adicionar novos métodos de entrega sem modificar o código existente.
- **Responsabilidade única**: Cada classe de estratégia é responsável por um único tipo de cálculo.

Essa abordagem não apenas demonstra o uso do Pattern Strategy, mas também se alinha bem com os princípios SOLID, especialmente o princípio de aberto/fechado e responsabilidade única.
