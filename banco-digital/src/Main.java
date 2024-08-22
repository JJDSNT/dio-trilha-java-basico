import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Criação do cliente
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        // Criação do banco
        Banco banco = new Banco();
        banco.setNome("Banco Digital");

        // Abertura de contas
        ContaCorrente cc = new ContaCorrente(venilton, 500.0); // Com limite de cheque especial
        ContaPoupanca poupanca = new ContaPoupanca(venilton);

        banco.abrirConta(cc);
        banco.abrirConta(poupanca);

        // Operações bancárias
        cc.depositar(200); // Depósito na conta corrente
        cc.sacar(150); // Saque na conta corrente
        cc.transferir(50, poupanca); // Transferência para a conta poupança

        // Impressão dos extratos
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        // Exemplo de uso do cheque especial
        try {
            cc.sacar(600); // Tentativa de saque que usa o limite do cheque especial
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Impressão do extrato após uso do cheque especial
        cc.imprimirExtrato();

        // Fechamento de conta
        banco.fecharConta(cc.getNumero());

        // Tentativa de buscar a conta fechada
        Conta contaBuscada = banco.buscarConta(cc.getNumero());
        if (contaBuscada == null) {
            System.out.println("Conta Corrente fechada e não encontrada no banco.");
        }
    }
}

