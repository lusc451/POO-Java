package br.edu.fatecfranca.lista5.ex1.classes;

import br.edu.fatecfranca.lista5.ex1.interfaces.Cidadao;
import br.edu.fatecfranca.lista5.ex1.interfaces.Contribuinte;
import br.edu.fatecfranca.lista5.ex1.interfaces.Empregado;
import br.edu.fatecfranca.lista5.ex1.interfaces.Professor;

public class Cidade {
    public String nome;

    public Cidade(String nome){
        this.nome = nome;
    }

    public Cidade(){};

    public void contrata(Professor p){
        System.out.println("A prefeitura de " + this.nome + " contratou um novo professor.");
        p.ensina();
        p.trabalha();
        System.out.println("\n");
    }

    public void contrata(Empregado e){
        System.out.println("A prefeitura de " + this.nome + " contratou um novo funcionário.");
        e.trabalha();
        System.out.println("\n");
    }

    public void cobraDe(Contribuinte c){
        System.out.println("O leão da receita mordeu o bumbum do contribuinte!");
        c.pagarIR();
        System.out.println("\n");
    }

    public void registra(Cidadao c){
        System.out.println("Há um novo cidadão na cidade de " + this.nome);
        c.getRG();
        System.out.println("\n");
    }

    public void alimenta(Animal a){
        System.out.println("A prefeitura de " + this.nome + " pagou o salário dos funcionários.");
        a.come();
    }
}
