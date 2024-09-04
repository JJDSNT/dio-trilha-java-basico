package com.jdias.design_pattern.model;

public class Pedido {

    private double peso;
    private Dimensoes dimensoes;
    private String destino;

    // Construtores
    public Pedido() {
    }

    public Pedido(double peso, Dimensoes dimensoes, String destino) {
        this.peso = peso;
        this.dimensoes = dimensoes;
        this.destino = destino;
    }

    // Getters e Setters
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Dimensoes getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(Dimensoes dimensoes) {
        this.dimensoes = dimensoes;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}

class Dimensoes {

    private double altura;
    private double largura;
    private double profundidade;

    // Construtores
    public Dimensoes() {
    }

    public Dimensoes(double altura, double largura, double profundidade) {
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
    }

    // Getters e Setters
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    // Método para calcular o volume do pacote, se necessário
    public double calcularVolume() {
        return altura * largura * profundidade;
    }
}