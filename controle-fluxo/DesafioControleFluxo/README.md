# DIO - Trilha Java Básico

[www.dio.me](https://www.dio.me)

## Autores
- Gleyson Sampaio

## Controle de Fluxo - Desafio

Vamos exercitar todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros. Com esses dois números, você deverá obter a quantidade de iterações (for) e realizar a impressão no console (`System.out.print`) dos números incrementados. Exemplo:

- Se você passar os números `12` e `30`, teremos uma iteração (for) com 18 ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.
- Se o primeiro parâmetro for **maior** que o segundo parâmetro, você deverá lançar a exceção customizada chamada `ParametrosInvalidosException` com a mensagem: "O segundo parâmetro deve ser maior que o primeiro".

### Passos

1. Crie o projeto `DesafioControleFluxo`.
2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do programa.
3. Dentro do projeto, crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema.

Abaixo temos um trecho de código no qual você poderá seguir alterando as partes que contenham `??`:

```java
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.??;
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.??;
        
        try {
            // chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (?? exception) {
            // imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
        }
    }
    
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        
        int contagem = parametroDois - parametroUm;
        // realizar o for para imprimir os números com base na variável contagem
    }
}
