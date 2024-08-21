public class ContaEspecial extends Conta {

    private double limiteCredito;
    private double taxaJuros;

    public ContaEspecial(Cliente cliente, double limiteCredito, double taxaJuros) {
        super(cliente);
        this.limiteCredito = limiteCredito;
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void sacar(double valor) {
        double saldoDisponivel = this.saldo + limiteCredito;
        if (valor > saldoDisponivel) {
            throw new IllegalArgumentException("Saldo insuficiente, incluindo limite de crédito");
        }
        super.sacar(valor);
    }

    @Override
    public String getTipoConta() {
        return "Conta Especial";
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
