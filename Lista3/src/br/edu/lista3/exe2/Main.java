package br.edu.lista3.exe2;

import br.edu.lista3.exe2.classes.Aluno;
import br.edu.lista3.exe2.classes.Curso;
import br.edu.lista3.exe2.classes.Professor;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1, "Lucas Antunes", "Lcsa123");
        Aluno a2 = new Aluno(2, "Renan", "renan.oliveira");
        Professor prof = new Professor(10, "Alexandre", "Alexandre.r");

        Curso curso1 = new Curso(100,"ADS", "Exatas");
        curso1.addDisciplina(1000,"Engenharia de Software","ES02", prof);

        curso1.addAlunoDisciplina(1000, a1);
        curso1.addAlunoDisciplina(1000, a2);

        System.out.println(curso1.toString());
    }
}