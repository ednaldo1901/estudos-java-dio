import br.com.dio.desafio.domineo.*;

import java.time.LocalDate;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        curso.setTitulo("caminhos pelo Java");
        curso.setDescricao("um curso voltado do basico ao avançado");
        curso.setCargaHoraria(44);

        Curso curso1 = new Curso();
        curso1.setTitulo("caminhos pelo JavaScript");
        curso1.setDescricao("um curso voltado do basico ao avançado");
        curso1.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setDescricao("professores qualificados para te ensinar tudo o que voce precisa ");
        mentoria.setTitulo("mentoria caminhos pelo java");
        mentoria.setData(LocalDate.now());

       /* System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria); **/

        Botcamp botcamp = new Botcamp();
        botcamp.setNome("Bootcamp java developer ");
        botcamp.setDescricao("Bootcamp do basico ao avançado em java");
        botcamp.getConteudosBootcamp().add(curso);
        botcamp.getConteudosBootcamp().add(curso1);
        botcamp.getConteudosBootcamp().add(mentoria);


        Dev devEdnado = new Dev();
        devEdnado.setNome("Ednaldo");
        devEdnado.inscreverBotcamp(botcamp);
        System.out.println("Conteudos incritos Ednaldo " + devEdnado.getConteudoInscrito());
        devEdnado.progredir();
        devEdnado.progredir();
        System.out.println("Conteudos Concluido"+ devEdnado.getConteudosConcluidos());
        System.out.println("XP: " + devEdnado.caucularXp());

        System.out.println("------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao Almeida");
        devJoao.inscreverBotcamp(botcamp);
        System.out.println("Conteudos incritos João " + devJoao.getConteudoInscrito());
        devJoao.progredir();
        System.out.println("Conteudos Concluidos João " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.caucularXp());
    }
}

