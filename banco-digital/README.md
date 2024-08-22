# Desafio
- Use todo o seu conhecimento para estender o domínio, incluindo novas classes, atributos e/ou métodos;

- ~~Incluir o Lombok ao projeto para reduzir sua verbosidade de código.~~

## Alterações no Projeto de Banco

### 1. Adicionar Novos Métodos à Interface `IConta`
- **`getSaldo();`**: Para permitir a consulta do saldo da conta.
- **`getTipoConta();`**: Para identificar o tipo da conta (corrente, poupança, etc.).

### 2. Adicionar Novas Classes
- **`Transacao`**: Classe para representar uma transação, com detalhes como tipo de transação (saque, depósito, transferência), valor e data.
- **`ContaEspecial`**: Subclasse de `ContaCorrente` que oferece limites de crédito e juros.

### 3. Adicionar Novos Métodos à Classe `Conta`
A classe `Conta` foi aprimorada para incluir novos métodos e funcionalidades, tornando-a mais robusta e funcional. As principais mudanças incluem:
- **Histórico de Transações**: Agora a classe `Conta` mantém um registro detalhado das transações realizadas (saques, depósitos e transferências).
- **Método `imprimirExtrato`**: Adiciona a capacidade de imprimir um extrato detalhado, incluindo o histórico de transações.

### 4. Alterações na Classe `ContaCorrente`
A classe `ContaCorrente` foi expandida para suportar limites de cheque especial e outras funcionalidades. As principais mudanças são:
- **Adição do Campo `limiteChequeEspecial`**: Inclui um campo para armazenar o limite do cheque especial disponível para a conta corrente.
- **Construtor Adicional**: Adicionado um construtor para permitir a definição do limite de cheque especial ao criar uma instância de `ContaCorrente`.
- **Método `sacar`**: Modificado para considerar o limite de cheque especial ao verificar se há saldo suficiente para o saque.
- **Implementação do Método `getTipoConta`**: Implementado para retornar `"Conta Corrente"`, indicando o tipo da conta.
- **Métodos Get e Set para `limiteChequeEspecial`**: Adicionados métodos para obter e definir o limite de cheque especial (`getLimiteChequeEspecial` e `setLimiteChequeEspecial`).

### 4. Adicionar Novos Métodos à Classe `Banco`
A classe `Banco` foi enriquecida com novos métodos para gerenciar contas e clientes. Agora, a classe pode realizar as seguintes operações:
- **Abrir Conta**: Adiciona uma nova conta ao banco e associa a um cliente.
- **Fechar Conta**: Remove uma conta do banco e encerra sua associação com o cliente.
- **Buscar Conta**: Permite localizar uma conta específica pelo número da conta.



---
# Criando um Banco Digital com Java e Orientação a Objetos

## 02/08/2021 - [Mentoria #1: Tire Suas Dúvidas Sobre Orientação a Objetos](https://www.youtube.com/watch?v=YS6ouOhkyNI)

Desafio: Considerando nosso conhecimento no domínio bancário, iremos abstrair uma solução Orientada a Objetos em Java. Para isso, vamos interpretar o seguinte cenário:
“Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

### Abstração
Habilidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em questão.

### Encapsulamento
Encapsular significa esconder a implementação dos objetos, criando assim interfaces de uso mais concisas e fáceis de usar/entender. O encapsulamento favorece principalmente dois aspectos de um sistema: a manutenção e a evolução.

### Herança
Permite que você defina uma classe filha que reutiliza (herda), estende ou modifica o comportamento de uma classe pai. A classe cujos membros são herdados é chamada de classe base. A classe que herda os membros da classe base é chamada de classe derivada.

### Polimorfismo
Capacidade de um objeto poder ser referenciado de várias formas, ou seja, é capacidade de tratar objetos criados a partir das classes específicas como objetos de uma classe genérica. Cuidado, polimorfismo não quer dizer que o objeto fica se transformando, muito pelo contrário, um objeto nasce de um tipo e morre daquele tipo, o que pode mudar é a maneira como nos referimos a ele.
