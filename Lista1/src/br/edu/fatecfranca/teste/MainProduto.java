package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto obj1 = new Produto(1, 15, "Chocolate", 15.2f);
        obj1.comprar(5);
        obj1.vender(8);
        obj1.subir(3.0f);
        obj1.descer(5.5f);
        System.out.println(obj1);
    }
}
