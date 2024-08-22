package br.com.dio.desafio.servico;

import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;

import java.util.Optional;

public class ProgressoService {

    public void progredir(Dev dev, Bootcamp bootcamp) {
        Optional<Conteudo> conteudo = dev.getConteudosInscritos(bootcamp).stream().findFirst();
        if (conteudo.isPresent()) {
            dev.getConteudosConcluidos(bootcamp).add(conteudo.get());
            dev.getConteudosInscritos(bootcamp).remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo deste bootcamp!");
        }
    }
}
