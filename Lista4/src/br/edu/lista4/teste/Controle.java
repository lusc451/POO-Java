package br.edu.lista4.teste;

import br.edu.lista4.exe3.Produto;
import br.edu.lista4.exe3.Radio;
import br.edu.lista4.exe3.TV;

public class Controle {
    public static void main(String[] args) {

        Produto p1 = new Radio(1, 10, "FM", "89.1");
        Produto p2 = new TV(2, 20, "Globo");

        //Testando produtos e imprimindo status
        p1.testaUnidade();
        System.out.println(p1.toString());
        p2.testaUnidade();
        System.out.println(p2.toString());

        //Alterando os valores dos produtos
        System.out.println("\nAlteração de valores: ");
        ((Radio) p1).trocaEstacao("91.1");
        ((Radio) p1).trocaBanda("AM");
        ((TV) p2).assistir();
        ((TV) p2).trocaCanal("SBT");

        //Imprimindo produtos com valores alterados
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}

