package br.edu.lista4.teste;

import br.edu.lista4.exe2.CartaoWeb;
import br.edu.lista4.exe2.DiaDosNamorados;
import br.edu.lista4.exe2.Natal;
import br.edu.lista4.exe2.Aniversario;

//import java.util.ArrayList;
//import java.util.List;

public class MainCartao {
    public static void main(String[] args) {
//        List<CartaoWeb> lista = new ArrayList<>();
//        lista.add(new DiaDosNamorados("Emily"));

        CartaoWeb[] cartoes = new CartaoWeb[3];

        cartoes[0] = new DiaDosNamorados("Emily");
        cartoes[1] = new Natal("Lucas");
        cartoes[2] = new Aniversario("João");

        for(CartaoWeb cartao : cartoes){
            cartao.showMessage();
        }
    }
}