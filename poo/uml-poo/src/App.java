public class App {
    public static void main(String[] args) throws Exception {
    
        iPhone meuIphone = new iPhone();

        // Chamando os métodos do iPhone
        System.out.println("Usando o iPhone:");


        meuIphone.selecionarMusica("Minha música favorita");
        meuIphone.pausar();
        meuIphone.tocar();


        meuIphone.ligar("11-2345-6789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        
        meuIphone.adicionarNovaAba();
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.atualizarPagina();

        System.out.println("Todos os métodos foram chamados com sucesso!");
    }
}
