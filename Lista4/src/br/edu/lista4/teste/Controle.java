package br.edu.lista4.teste;

import br.edu.lista4.exe3.Produto;
import br.edu.lista4.exe3.Radio;
import br.edu.lista4.exe3.TV;

public class Controle {
    public static void main(String[] args) {
        Produto p1 = new Produto(1, 10);
        p1.testaUnidade();
        System.out.println(p1);

        Produto p2 = new TV(2, 20, "Globo");
        p2.testaUnidade();
        System.out.println(p2);

        Produto p3 = new Radio(3, 30, "Jovem Pan", "89.1");
        p3.testaUnidade();
        System.out.println(p3);
    }
}
