package br.edu.fatecfranca.exe1;

public class Aluno {
    public int numAluno, idade;
    public float p1, p2;
    public String nome;

    public Aluno(){

    }

    public Aluno(int numAluno, int idade, float p1, float p2, String nome) {
        this.numAluno = numAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
        this.nome = nome;
    }

    public float notaFinal(){
        return (this.p1 + this.p2) / 2;
    }

    public String passou(){
        return this.notaFinal() >= 6 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "numAluno: " + numAluno +
                ", Nome: '" + nome + '\'' +
                ", Idade: " + idade +
                ", Média: " + notaFinal() +
                ", Situação: " + passou() +
                '}';
    }

}