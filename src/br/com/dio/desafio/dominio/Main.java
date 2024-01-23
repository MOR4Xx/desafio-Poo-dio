package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("Descricao curso java");
        curso2.setCargaHoraria(8);

        Conteudo conteudo = new Curso();


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("123");
        mentoria1.setDescricao("Descricao mentoria");
        mentoria1.setDate(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);

        
    }
}