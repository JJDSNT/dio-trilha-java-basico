package com.jdias.design_pattern.model;

public class Pedido {

    private double peso;
    private Dimensoes dimensoes;
    private String destino;
    private TipoFrete tipoFrete;
    private double volume;

    // Construtores
    public Pedido() {
    }

    public Pedido(double peso, Dimensoes dimensoes, String destino) {
        this.peso = peso;
        this.volume = dimensoes.calcularVolume();
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

    public double getVolume() {
        return volume;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public TipoFrete getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(TipoFrete tipoFrete) {
        this.tipoFrete = tipoFrete;
    }
}
