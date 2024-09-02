package br.edu.lista2.teste;
import br.edu.lista2.exe2.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        // Aluno fornecendo os dados - APROVADO
        Aluno aluno1 = new Aluno(123456, "Lucas Antunes", 25, 7.5f, 8.0f);
        aluno1.dadosAluno();
        aluno1.notaFinal();

        // Aluno sem fornecer dados
        Aluno aluno2 = new Aluno();
        aluno2.dadosAluno();
        aluno2.notaFinal();

        // Tentando acessar as variáveis da classe Aluno sem get e set (comentado pois causaria erro)
        // System.out.println(aluno1.nome);  // Erro: nome tem acesso privado
    }
}
