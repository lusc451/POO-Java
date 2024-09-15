package br.edu.lista4.teste;

import br.edu.lista4.exe3.Produto;
import br.edu.lista4.exe3.Radio;
import br.edu.lista4.exe3.TV;

public class Controle {
    public static void main(String[] args) {

        Produto radio = new Radio(1, 10, "FM", "89.1");
        Produto tv = new TV(2, 20, "Globo");

        //Testando produtos e imprimindo status
        radio.testaUnidade();
        System.out.println(radio.toString());
        tv.testaUnidade();
        System.out.println(tv.toString());

        //Alterando os valores dos produtos
        System.out.println("\nAlteração de valores: ");
        ((Radio) radio).trocaEstacao("91.1");
        ((Radio) radio).trocaBanda("AM");
        ((TV) tv).assistir();
        ((TV) tv).trocaCanal("SBT");

        //Imprimindo produtos com valores alterados
        System.out.println(radio.toString());
        System.out.println(tv.toString());
    }
}

