public class iPhone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {

    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }


    // public void tocarMusica() {
    //     reprodutorMusical.tocar();
    // }

    // public void fazerChamada(String numero) {
    //     aparelhoTelefonico.ligar(numero);
    // }

    // public void navegarNaWeb(String url) {
    //     navegadorInternet.exibirPagina(url);
    // }

    // Métodos da interface IReprodutorMusical
    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
    }

    // Métodos da interface IAparelhoTelefonico
    @Override
    public void ligar(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    @Override
    public void atender() {
        aparelhoTelefonico.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        aparelhoTelefonico.iniciarCorreioVoz();
    }

    // Métodos da interface INavegadorInternet
    @Override
    public void exibirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }
}
