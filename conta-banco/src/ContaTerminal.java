import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do Cliente:");
        scanner.nextLine(); // Consumir a linha restante
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá ".concat(nomeCliente)
                              .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                              .concat(agencia)
                              .concat(", conta ")
                              .concat(String.valueOf(numero))
                              .concat(" e seu saldo ")
                              .concat(String.valueOf(saldo))
                              .concat(" já está disponível para saque.");
        
        System.out.println(mensagem);
        
        scanner.close();
    }
}
