package com.jdias.design_pattern.model.FreteStrategyImpl;

import com.jdias.design_pattern.model.FreteStrategy;
import com.jdias.design_pattern.model.Pedido;

public class TransportadoraFreteStrategy implements FreteStrategy {

    @Override
    public double calcularFrete(Pedido pedido) {

        double peso = pedido.getPeso();

        double valorFrete = peso * 2;
        
        return valorFrete;
    }

}
