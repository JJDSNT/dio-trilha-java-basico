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
    
    // Inscrever em um bootcamp
    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcampsInscritos.put(bootcamp, new HashSet<>(bootcamp.getConteudos()));
        bootcampsConcluidos.put(bootcamp, new HashSet<>());
    }

    // Progredir em um bootcamp
    public void progredir(Bootcamp bootcamp) {
        Set<Conteudo> conteudosInscritos = bootcampsInscritos.get(bootcamp);
        if (conteudosInscritos != null && !conteudosInscritos.isEmpty()) {
            Conteudo conteudo = conteudosInscritos.iterator().next();
            bootcampsConcluidos.get(bootcamp).add(conteudo);
            conteudosInscritos.remove(conteudo);
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo neste bootcamp!");
        }
    }

    // Calcular XP total
    public double calcularTotalXp() {
        return bootcampsConcluidos.values().stream()
                  .flatMap(Set::stream)
                  .mapToDouble(Conteudo::calcularXp)
                  .sum();
    }

    // Métodos para obter os conteúdos inscritos e concluídos em um bootcamp específico
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
