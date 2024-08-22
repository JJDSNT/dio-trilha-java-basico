import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    /**
     * Adiciona uma nova conta ao banco e a associa a um cliente.
     *
     * @param conta A conta a ser adicionada.
     */
    public void abrirConta(Conta conta) {
        contas.add(conta);
    }

    /**
     * Remove uma conta do banco e encerra sua associação com o cliente.
     *
     * @param numeroConta O número da conta a ser fechada.
     * @return true se a conta foi removida, false caso contrário.
     */
    public boolean fecharConta(int numeroConta) {
        Conta conta = buscarConta(numeroConta);
        if (conta != null) {
            return contas.remove(conta);
        }
        return false;
    }

    /**
     * Localiza uma conta específica pelo número da conta.
     *
     * @param numeroConta O número da conta a ser buscada.
     * @return A conta encontrada ou null se não existir.
     */
    public Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}
