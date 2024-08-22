import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	private List<Transacao> historicoTransacoes = new ArrayList<>();

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) {
		alterarSaldo(-valor);
		registrarTransacao(new Transacao("Saque", valor, LocalDateTime.now()));
	}
	
	@Override
	public void depositar(double valor) {
		alterarSaldo(valor);
		registrarTransacao(new Transacao("Depósito", valor, LocalDateTime.now()));
	}
	
	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

    @Override
    public abstract String getTipoConta();

	private void alterarSaldo(double valor) {
        if (saldo + valor < 0) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo += valor;
    }

    private void registrarTransacao(Transacao transacao) {
        historicoTransacoes.add(transacao);
    }

	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato da Conta:");
		imprimirInfosComuns();
		for (Transacao transacao : historicoTransacoes) {
			System.out.println(transacao);
		}
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
