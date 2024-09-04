package com.jdias.design_pattern.model.FreteStrategyImpl;

import com.jdias.design_pattern.model.FreteStrategy;
import com.jdias.design_pattern.model.Pedido;

public class RetiradaLojaFreteStrategy implements FreteStrategy {

    @Override
    public double calcularFrete(Pedido pedido) {
        return 0;
    }

}
