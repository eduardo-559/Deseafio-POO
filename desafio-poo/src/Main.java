import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTitulo("Curso de POO");
        c1.setDescricao("Projeto feito utilizando os paradigmas orientado a objetos");
        c1.setCargaHoraria(20);

        Curso c2 = new Curso();
        c2.setTitulo("Curso de Java");
        c2.setDescricao("Projeto com ênfase em lógica de programação utilizando a linguagem Java");
        c2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de POO com Java");
        mentoria.setDescricao("Desenvolvimento de aplicações em Java utilizando a programação orientada a objetos");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp utilizando a linguagem Java");
        bootcamp.getConteudos().add(c1);
        bootcamp.getConteudos().add(c2);
        bootcamp.getConteudos().add(mentoria);

        Dev edu = new Dev();
        edu.setNome("Eduardo");
        edu.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos de Eduardo:" + edu.getConteudosInscritos());
        edu.progredir();
        edu.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Eduardo:" + edu.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Eduardo:" + edu.getConteudosConcluidos());
        System.out.println("XP:" + edu.calcularTotalXp());

        System.out.println("-------");

        Dev lima = new Dev();
        lima.setNome("Lima");
        lima.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Lima:" + lima.getConteudosInscritos());
        lima.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Lima:" + lima.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos de Lima:" + lima.getConteudosConcluidos());
        System.out.println("XP:" + lima.calcularTotalXp());
    }
}