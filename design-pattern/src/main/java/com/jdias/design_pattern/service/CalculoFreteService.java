package com.jdias.design_pattern.service;

import org.springframework.stereotype.Service;

import com.jdias.design_pattern.exception.TipoFreteNaoSuportadoException;
import com.jdias.design_pattern.model.FreteStrategy;
import com.jdias.design_pattern.model.Pedido;
import com.jdias.design_pattern.model.TipoFrete;
import com.jdias.design_pattern.model.FreteStrategyImpl.CorreiosFreteStrategy;
import com.jdias.design_pattern.model.FreteStrategyImpl.RetiradaLojaFreteStrategy;
import com.jdias.design_pattern.model.FreteStrategyImpl.TransportadoraFreteStrategy;

@Service
public class CalculoFreteService {

    public double calcularFrete(Pedido pedido, TipoFrete tipoFrete) {
        FreteStrategy estrategia = escolherEstrategia(tipoFrete);
        return estrategia.calcularFrete(pedido);
    }

    private FreteStrategy escolherEstrategia(TipoFrete tipoFrete) {
        switch (tipoFrete) {
            case CORREIOS:
                return new CorreiosFreteStrategy();
            case TRANSPORTADORA:
                return new TransportadoraFreteStrategy();
            case RETIRADA_LOJA:
                return new RetiradaLojaFreteStrategy();
            default:
                throw new TipoFreteNaoSuportadoException("Tipo de frete não suportado: " + tipoFrete);
        }
    }
}