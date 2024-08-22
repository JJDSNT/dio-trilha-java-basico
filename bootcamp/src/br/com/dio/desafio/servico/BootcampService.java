package br.com.dio.desafio.servico;

import java.util.Set;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Dev;

public class BootcampService {

    public Bootcamp criarBootcamp(String nome, String descricao) {
        return new Bootcamp(nome, descricao);
    }

    public void adicionarConteudoNoBootcamp(Bootcamp bootcamp, Conteudo conteudo) {
        bootcamp.getConteudos().add(conteudo);
    }

    public void criarConteudo(Conteudo conteudo, String titulo, String descricao) {
        conteudo.setTitulo(titulo);
        conteudo.setDescricao(descricao);
    }

    public void inscreverDevNoBootcamp(Dev dev, Bootcamp bootcamp) {
        dev.inscreverEmBootcamp(bootcamp);
        dev.getConteudosInscritos(bootcamp).addAll(bootcamp.getConteudos());
    }

    public void progredir(Dev dev, Bootcamp bootcamp) {
        Set<Conteudo> conteudosInscritos = dev.getConteudosInscritos(bootcamp);
        if (!conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.iterator().next();
            dev.getConteudosConcluidos(bootcamp).add(conteudo);
            conteudosInscritos.remove(conteudo);
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo deste bootcamp!");
        }
    }
    

    public double calcularTotalXp(Dev dev) {
        return dev.calcularTotalXp();
    }
}
