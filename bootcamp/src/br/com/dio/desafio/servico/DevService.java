package br.com.dio.desafio.servico;

import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Bootcamp;

public class DevService {

    private BootcampService bootcampService;

    // Construtor para injeção de dependência
    public DevService(BootcampService bootcampService) {
        this.bootcampService = bootcampService;
    }

    public void inscreverEmBootcamp(Dev dev, Bootcamp bootcamp) {
        bootcampService.inscreverDevNoBootcamp(dev, bootcamp);
    }

    public double calcularTotalXp(Dev dev) {
        return dev.calcularTotalXp();
    }
}
