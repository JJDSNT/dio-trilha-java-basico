package com.jdias.design_pattern.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jdias.design_pattern.model.Pedido;
import com.jdias.design_pattern.model.TipoFrete;
import com.jdias.design_pattern.service.CalculoFreteService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private final CalculoFreteService calculoFreteService;

    public PedidoController(CalculoFreteService calculoFreteService) {
        this.calculoFreteService = calculoFreteService;
    }

    @PostMapping("/calcular-frete")
    public double calcularFrete(@RequestBody Pedido pedido, @RequestParam TipoFrete tipoFrete) {
        return calculoFreteService.calcularFrete(pedido, tipoFrete);
    }
}