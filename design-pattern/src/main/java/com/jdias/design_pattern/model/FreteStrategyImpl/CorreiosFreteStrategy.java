package com.jdias.design_pattern.model.FreteStrategyImpl;

import com.jdias.design_pattern.model.FreteStrategy;
import com.jdias.design_pattern.model.Pedido;

public class CorreiosFreteStrategy implements FreteStrategy {

    @Override
    public double calcularFrete(Pedido pedido) {

        double peso = pedido.getPeso();
        double volume = pedido.getVolume();

        double valorFrete = peso * 0.1 + (volume) * 0.05;
        
        return valorFrete;
    }

}
