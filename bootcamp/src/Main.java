import br.com.dio.desafio.dominio.*;
import br.com.dio.desafio.servico.BootcampService;
import br.com.dio.desafio.servico.ConteudoService;
import br.com.dio.desafio.servico.DevService;
import br.com.dio.desafio.servico.ProgressoService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando serviços
        BootcampService bootcampService = new BootcampService();
        ConteudoService conteudoService = new ConteudoService();
        DevService devService = new DevService();
        ProgressoService progressoService = new ProgressoService();

        // Criando conteúdos
        Curso cursoJava = new Curso();
        conteudoService.criarConteudo(cursoJava, "Curso Java", "Descrição do Curso Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJs = new Curso();
        conteudoService.criarConteudo(cursoJs, "Curso JS", "Descrição do Curso JS");
        cursoJs.setCargaHoraria(4);

        Mentoria mentoriaJava = new Mentoria();
        conteudoService.criarConteudo(mentoriaJava, "Mentoria de Java", "Descrição da Mentoria de Java");
        mentoriaJava.setData(LocalDate.now());

        Curso cursoPython = new Curso();
        conteudoService.criarConteudo(cursoPython, "Curso Python", "Descrição do Curso Python");
        cursoPython.setCargaHoraria(6);

        Mentoria mentoriaPython = new Mentoria();
        conteudoService.criarConteudo(mentoriaPython, "Mentoria de Python", "Descrição da Mentoria de Python");
        mentoriaPython.setData(LocalDate.now());

        // Criando bootcamps
        Bootcamp bootcampJavaDev = new Bootcamp();
        bootcampJavaDev.setNome("Bootcamp Java Developer");
        bootcampJavaDev.setDescricao("Descrição do Bootcamp Java Developer");

        Bootcamp bootcampPythonDev = new Bootcamp();
        bootcampPythonDev.setNome("Bootcamp Python Developer");
        bootcampPythonDev.setDescricao("Descrição do Bootcamp Python Developer");

        // Adicionando conteúdos aos bootcamps
        bootcampService.adicionarConteudoNoBootcamp(bootcampJavaDev, cursoJava);
        bootcampService.adicionarConteudoNoBootcamp(bootcampJavaDev, cursoJs);
        bootcampService.adicionarConteudoNoBootcamp(bootcampJavaDev, mentoriaJava);

        bootcampService.adicionarConteudoNoBootcamp(bootcampPythonDev, cursoPython);
        bootcampService.adicionarConteudoNoBootcamp(bootcampPythonDev, mentoriaPython);

        // Criando desenvolvedores
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");

        Dev devJoao = new Dev();
        devJoao.setNome("João");

        // Inscrevendo desenvolvedores nos bootcamps
        devService.inscreverBootcamp(devCamila, bootcampJavaDev);
        devService.inscreverBootcamp(devCamila, bootcampPythonDev);

        devService.inscreverBootcamp(devJoao, bootcampJavaDev);

        // Progressão dos desenvolvedores
        progressoService.progredir(devCamila, bootcampJavaDev);
        progressoService.progredir(devCamila, bootcampJavaDev);
        progressoService.progredir(devCamila, bootcampJavaDev);

        progressoService.progredir(devJoao, bootcampJavaDev);

        // Resultados
        imprimirResultados(devCamila);
        System.out.println("-------");
        imprimirResultados(devJoao);
    }

    private static void imprimirResultados(Dev dev) {
        System.out.println("Desenvolvedor: " + dev.getNome());
        for (Bootcamp bootcamp : dev.getBootcampsInscritos().keySet()) {
            System.out.println("Bootcamp: " + bootcamp.getNome());
            System.out.println("Conteúdos Inscritos: " + dev.getBootcampsInscritos().get(bootcamp));
            System.out.println("Conteúdos Concluídos: " + dev.getBootcampsConcluidos().get(bootcamp));
            System.out.println("XP: " + dev.calcularTotalXp(bootcamp));
            System.out.println();
        }
    }
}
