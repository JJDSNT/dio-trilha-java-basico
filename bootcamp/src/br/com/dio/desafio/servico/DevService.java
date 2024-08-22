package br.com.dio.desafio.servico;

import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Bootcamp;

public class DevService {

    public void inscreverBootcamp(Dev dev, Bootcamp bootcamp) {
        dev.inscreverBootcamp(bootcamp);
    }

    public void progredir(Dev dev, Bootcamp bootcamp) {
        dev.progredir(bootcamp);
    }
}
