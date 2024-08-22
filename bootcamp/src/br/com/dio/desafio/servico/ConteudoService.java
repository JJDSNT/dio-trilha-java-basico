package br.com.dio.desafio.servico;

import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.util.Set;

public class ConteudoService {

    // Método para validar e criar um novo conteúdo
    public Conteudo criarConteudo(String tipo, String titulo, String descricao) {
        Conteudo conteudo = null;
        switch (tipo) {
            case "Curso":
                conteudo = new Curso(); // Assumindo que Curso é uma classe concreta
                break;
            case "Mentoria":
                conteudo = new Mentoria(); // Assumindo que Mentoria é uma classe concreta
                break;
            default:
                throw new IllegalArgumentException("Tipo de conteúdo desconhecido: " + tipo);
        }
        conteudo.setTitulo(titulo);
        conteudo.setDescricao(descricao);
        return conteudo;
    }

    // Método para calcular a XP total de um conjunto de conteúdos
    public double calcularXpTotal(Set<Conteudo> conteudos) {
        return conteudos.stream()
                        .mapToDouble(Conteudo::calcularXp)
                        .sum();
    }

    // Método para validar o conteúdo
    public void validarConteudo(Conteudo conteudo) {
        if (conteudo.getTitulo() == null || conteudo.getTitulo().isEmpty()) {
            throw new IllegalArgumentException("O título do conteúdo não pode ser vazio.");
        }
        // Outras validações podem ser adicionadas aqui
    }
}
