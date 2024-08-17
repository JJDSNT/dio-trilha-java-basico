public class ReprodutorMusical implements IReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("A música está tocando.");
    }

    @Override
    public void pausar() {
        System.out.println("A música foi pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("A música "+ musica +" foi selecionada.");
    }
}
