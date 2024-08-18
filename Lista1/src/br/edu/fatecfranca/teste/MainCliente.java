package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe2.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(1, 10, "Lucas", 150.5f);
        obj1.depositar(4000);
        obj1.sacar(1000);
        obj1.sacar(800);
        obj1.sacar(400);
        System.out.println(obj1);
    }
}
