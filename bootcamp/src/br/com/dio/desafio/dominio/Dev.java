package br.com.dio.desafio.dominio;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dev {
    private String nome;
    private Map<Bootcamp, Set<Conteudo>> bootcampsInscritos = new HashMap<>();
    private Map<Bootcamp, Set<Conteudo>> bootcampsConcluidos = new HashMap<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        if (!bootcampsInscritos.containsKey(bootcamp)) {
            bootcampsInscritos.put(bootcamp, new HashSet<>(bootcamp.getConteudos()));
            bootcampsConcluidos.put(bootcamp, new HashSet<>());
        } else {
            System.err.println("O Dev já está inscrito neste bootcamp.");
        }
    }

    public void progredir(Bootcamp bootcamp) {
        Set<Conteudo> conteudosInscritos = bootcampsInscritos.get(bootcamp);
        if (conteudosInscritos != null && !conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.iterator().next();
            bootcampsConcluidos.get(bootcamp).add(conteudo);
            conteudosInscritos.remove(conteudo);
        } else {
            System.err.println("Nenhum conteúdo para progredir neste bootcamp.");
        }
    }

    public double calcularTotalXp(Bootcamp bootcamp) {
        return bootcampsConcluidos.getOrDefault(bootcamp, Collections.emptySet())
                                  .stream()
                                  .mapToDouble(Conteudo::calcularXp)
                                  .sum();
    }

    public Set<Conteudo> getConteudosInscritos(Bootcamp bootcamp) {
        return bootcampsInscritos.getOrDefault(bootcamp, Collections.emptySet());
    }

    public Set<Conteudo> getConteudosConcluidos(Bootcamp bootcamp) {
        return bootcampsConcluidos.getOrDefault(bootcamp, Collections.emptySet());
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Map<Bootcamp, Set<Conteudo>> getBootcampsInscritos() {
        return bootcampsInscritos;
    }

    public Map<Bootcamp, Set<Conteudo>> getBootcampsConcluidos() {
        return bootcampsConcluidos;
    }
}
