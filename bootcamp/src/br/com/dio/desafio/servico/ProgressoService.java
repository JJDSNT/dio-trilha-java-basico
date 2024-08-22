package br.com.dio.desafio.servico;

import java.util.Optional;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;

public class ProgressoService {
    public void progredir(Dev dev) {
        Optional<Conteudo> conteudo = dev.getConteudosInscritos().stream().findFirst();
        if (conteudo.isPresent()) {
            dev.getConteudosConcluidos().add(conteudo.get());
            dev.getConteudosInscritos().remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }
}
