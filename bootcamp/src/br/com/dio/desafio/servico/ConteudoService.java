package br.com.dio.desafio.servico;

import br.com.dio.desafio.dominio.Conteudo;

public class ConteudoService {

    public void criarConteudo(Conteudo conteudo, String titulo, String descricao) {
        conteudo.setTitulo(titulo);
        conteudo.setDescricao(descricao);
    }
}
