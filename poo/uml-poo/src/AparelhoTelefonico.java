public class AparelhoTelefonico implements IAparelhoTelefonico {

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para "+numero);
    }

    @Override
    public void atender() {
        System.out.println("Alô, ligação atendida!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Bem vindo ao seu correio de voz!");
    }
}