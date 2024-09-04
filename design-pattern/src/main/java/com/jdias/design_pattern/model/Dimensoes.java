package com.jdias.design_pattern.model;

public class Dimensoes {

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