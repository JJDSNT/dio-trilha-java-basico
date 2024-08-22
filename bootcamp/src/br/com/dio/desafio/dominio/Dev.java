package br.com.dio.desafio.dominio;

import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class Dev {
    private String nome;
    private Map<Bootcamp, Set<Conteudo>> bootcampsInscritos = new HashMap<>();
    private Map<Bootcamp, Set<Conteudo>> conteudosInscritos = new HashMap<>();
    private Map<Bootcamp, Set<Conteudo>> conteudosConcluidos = new HashMap<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Bootcamp, Set<Conteudo>> getBootcampsInscritos() {
        return bootcampsInscritos;
    }

    public void inscreverEmBootcamp(Bootcamp bootcamp) {
        bootcampsInscritos.putIfAbsent(bootcamp, new HashSet<>(bootcamp.getConteudos()));
        conteudosInscritos.putIfAbsent(bootcamp, new HashSet<>(bootcamp.getConteudos()));
        conteudosConcluidos.putIfAbsent(bootcamp, new HashSet<>());
    }

    public Set<Conteudo> getConteudosInscritos(Bootcamp bootcamp) {
        return conteudosInscritos.getOrDefault(bootcamp, new HashSet<>());
    }

    public Set<Conteudo> getConteudosConcluidos(Bootcamp bootcamp) {
        return conteudosConcluidos.getOrDefault(bootcamp, new HashSet<>());
    }

    public void progredir(Bootcamp bootcamp) {
        Set<Conteudo> conteudosInscritos = getConteudosInscritos(bootcamp);
        if (!conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.iterator().next();
            getConteudosConcluidos(bootcamp).add(conteudo);
            conteudosInscritos.remove(conteudo);
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo deste bootcamp!");
        }
    }

    public double calcularTotalXp() {
        return conteudosConcluidos.values().stream()
            .flatMap(Set::stream)
            .mapToDouble(Conteudo::calcularXp)
            .sum();
    }
}
