import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDiscricao("Descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDiscricao("Descrição do curso Js");
        curso2.setCargaHoraria(4);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDiscricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso2);
        System.out.println(curso1);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devItalo = new Dev();
        devItalo.setNome("Italo");
        devItalo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Italo:" + devItalo.getConteudosInscritos());

        devItalo.progredir();
        devItalo.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Italo:" + devItalo.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Italo:" + devItalo.getConteudosConcluidos());
        System.out.println("XP: " + devItalo.calcularTotalXp());

        System.out.println("-------------");

        Dev devWaleska = new Dev();
        devWaleska.setNome("Waleska");
        devWaleska.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Waleska:" + devWaleska.getConteudosInscritos());

        devWaleska.progredir();
        devWaleska.progredir();
        devWaleska.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Waleska:" + devWaleska.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Waleska:" + devWaleska.getConteudosConcluidos());
        System.out.println("XP: " + devWaleska.calcularTotalXp());


    }
}
