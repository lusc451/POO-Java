package br.edu.lista2.teste;
import br.edu.lista2.exe1.Cliente;

public class MainCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente("123456-7", "1234-5", "Fulano", 1000);
        obj1.depositar(1000);
        obj1.sacar(1500);
        System.out.println(obj1);

        Cliente obj2 = new Cliente("12345678", "12345", "Beltrano", 1000);
        obj2.depositar(1000);
        obj2.sacar(2500);
        System.out.println(obj2);
    }
}
