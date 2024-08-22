package br.com.dio.desafio.servico;

import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;

import java.util.Optional;

public class ProgressoService {

    public void progredir(Dev dev, Bootcamp bootcamp) {
        // Verifica se o desenvolvedor está inscrito no bootcamp
        if (dev.getConteudosInscritos(bootcamp) != null && !dev.getConteudosInscritos(bootcamp).isEmpty()) {
            // Obtém o conteúdo inscrito no bootcamp
            Optional<Conteudo> conteudo = dev.getConteudosInscritos(bootcamp).stream().findFirst();
            
            if (conteudo.isPresent()) {
                // Move o conteúdo da lista de inscritos para a lista de concluídos
                dev.progredir(bootcamp);
            } else {
                System.err.println("Nenhum conteúdo para progredir neste bootcamp.");
            }
        } else {
            System.err.println("O Dev não está inscrito neste bootcamp.");
        }
    }
}
