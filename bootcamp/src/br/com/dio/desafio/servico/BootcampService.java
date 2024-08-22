package br.com.dio.desafio.servico;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;

public class BootcampService {

    public void inscreverDevNoBootcamp(Dev dev, Bootcamp bootcamp) {
        dev.inscreverBootcamp(bootcamp);
    }

    public void adicionarConteudoNoBootcamp(Bootcamp bootcamp, Conteudo conteudo) {
        bootcamp.getConteudos().add(conteudo);
    }

    public void adicionarDevNoBootcamp(Bootcamp bootcamp, Dev dev) {
        bootcamp.getDevsInscritos().add(dev);
    }
}
