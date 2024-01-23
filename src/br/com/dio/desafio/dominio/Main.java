package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("MENTORIA");
        mentoria1.setDescricao("Descricao mentoria");
        mentoria1.setDate(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria1);

        BootCamp objBootCamp = new BootCamp();
        objBootCamp.setNome("Java Developer");
        objBootCamp.setDescricao("Descriçao Bootcaamp Java developer");
        objBootCamp.getConteudo().add(curso1);
        objBootCamp.getConteudo().add(curso2);
        objBootCamp.getConteudo().add(mentoria1);

        Dev devJorge = new Dev();
        devJorge.setNome("Jorge");
        devJorge.inscreverBootCamp(objBootCamp);
        System.out.println("Conteudo Incrito Jorge: "+ devJorge.getConteudosInscritos());
        devJorge.progredindo();
        devJorge.progredindo();
        devJorge.progredindo();
        System.out.println("-");
        System.out.println("Conteudo Incrito Jorge: "+ devJorge.getConteudosInscritos());
        System.out.println("Conteudo cONCLUIDO Jorge: "+ devJorge.getConteudosConcluidos());
        System.out.println("XP: "+ devJorge.calcularXP());


        System.out.println("-----------------");
        Dev devJoao = new Dev();
        devJoao.setNome("joao");
        devJoao.inscreverBootCamp(objBootCamp);
        System.out.println("Conteudo Incrito Joao: "+ devJoao.getConteudosInscritos());
        devJoao.progredindo();
        devJoao.progredindo();
        devJoao.progredindo();
        System.out.println("-");
        System.out.println("Conteudo Incrito Joao: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteudo cONCLUIDOS Joao: "+ devJoao.getConteudosConcluidos());
        System.out.println("XP: "+ devJoao.calcularXP());

    }
}