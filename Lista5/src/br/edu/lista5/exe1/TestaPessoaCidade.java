package br.edu.lista5.exe1;

import br.edu.lista5.exe1.classes.Cidade;
import br.edu.lista5.exe1.classes.Pessoa;
import br.edu.lista5.exe1.interfaces.Empregado;

public class TestaPessoaCidade {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(46,"Carlos", "23.423.654-5", "123.456.789-00");
        Cidade c1 = new Cidade("Sales Oliveira");

        c1.contrata(p1);
        c1.contrata((Empregado) p1);

        c1.cobraDe(p1);

        c1.registra(p1);

        c1.alimenta(p1);
    }
}
