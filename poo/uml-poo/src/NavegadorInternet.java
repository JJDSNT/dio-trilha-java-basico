public class NavegadorInternet implements INavegadorInternet {

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: "+ url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi aberta!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("A página foi atualizada");
    }
}