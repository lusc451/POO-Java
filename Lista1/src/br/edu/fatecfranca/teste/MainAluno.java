package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(1, 28, 8.3f, 9.1f, "Lucas");

        System.out.println(obj1.toString());
    }
}
