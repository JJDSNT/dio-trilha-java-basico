import br.com.dio.desafio.dominio.*;
import br.com.dio.desafio.servico.BootcampService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando serviços
        BootcampService bootcampService = new BootcampService();
    
        // Criando conteúdos
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição do Curso Java");
        cursoJava.setCargaHoraria(8);
    
        Curso cursoJs = new Curso();
        cursoJs.setTitulo("Curso JS");
        cursoJs.setDescricao("Descrição do Curso JS");
        cursoJs.setCargaHoraria(4);
    
        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Java");
        mentoriaJava.setDescricao("Descrição da Mentoria de Java");
        mentoriaJava.setData(LocalDate.now());
    
        Curso cursoPython = new Curso();
        cursoPython.setTitulo("Curso Python");
        cursoPython.setDescricao("Descrição do Curso Python");
        cursoPython.setCargaHoraria(6);
    
        Mentoria mentoriaPython = new Mentoria();
        mentoriaPython.setTitulo("Mentoria de Python");
        mentoriaPython.setDescricao("Descrição da Mentoria de Python");
        mentoriaPython.setData(LocalDate.now());
    
        // Criando bootcamps
        Bootcamp bootcampJavaDev = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
        Bootcamp bootcampPythonDev = new Bootcamp("Bootcamp Python Developer", "Descrição do Bootcamp Python Developer");
    
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
        bootcampService.inscreverDevNoBootcamp(devCamila, bootcampJavaDev);
        bootcampService.inscreverDevNoBootcamp(devCamila, bootcampPythonDev);
    
        bootcampService.inscreverDevNoBootcamp(devJoao, bootcampJavaDev);
    
        // Progressão dos desenvolvedores
        bootcampService.progredir(devCamila, bootcampJavaDev);
        bootcampService.progredir(devCamila, bootcampJavaDev); // Aumente conforme necessário para verificar
    
        bootcampService.progredir(devJoao, bootcampJavaDev);
    
        // Resultados
        imprimirResultados(devCamila);
        System.out.println("-------");
        imprimirResultados(devJoao);
    }
    

    private static void imprimirResultados(Dev dev) {
        System.out.println("Desenvolvedor: " + dev.getNome());
        for (Bootcamp bootcamp : dev.getBootcampsInscritos().keySet()) {
            System.out.println("Bootcamp: " + bootcamp.getNome());
            System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos(bootcamp));
            System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos(bootcamp));
            System.out.println();
        }
        System.out.println("XP Total: " + dev.calcularTotalXp());
    }
}
