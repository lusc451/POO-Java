package br.edu.lista4.teste;

import br.edu.lista4.exe2.CartaoWeb;
import br.edu.lista4.exe2.DiaDosNamorados;

import java.util.ArrayList;
import java.util.List;

public class MainCartao {
    public static void main(String[] args) {
        List<CartaoWeb> lista = new ArrayList<>();
        lista.add(new DiaDosNamorados("Lucas"));
        lista.add(new DiaDosNamorados("Emily"));

        for(CartaoWeb cartao : lista){
            cartao.showMessage();
        }
    }
}