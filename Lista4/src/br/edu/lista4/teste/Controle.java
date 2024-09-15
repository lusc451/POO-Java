package br.edu.lista4.teste;

import br.edu.lista4.exe3.Produto;
import br.edu.lista4.exe3.Radio;
import br.edu.lista4.exe3.TV;

public class Controle {

    //Método para testar o produto e imprimir o status
    public static void testaProduto(Produto produto){
        produto.testaUnidade();
        System.out.println(produto.toString());
    }

    public static void main(String[] args) {

        Produto radio = new Radio(1, 10, "FM", "89.1");
        Produto tv = new TV(2, 20, "Globo");

        //Testando os produtos (Radio e TV)
        testaProduto(radio);
        testaProduto(tv);

        //Polimorfismo
        ((Radio) radio).escutar();
        ((Radio) radio).trocaEstacao("91.1");
        ((Radio) radio).trocaBanda("AM");

        ((TV) tv).assistir();
        ((TV) tv).trocaCanal("SBT");


    }
}

