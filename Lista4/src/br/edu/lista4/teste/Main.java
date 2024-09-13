package br.edu.lista4.teste;
import br.edu.lista4.exe0.Assistente;
import br.edu.lista4.exe0.Diretor;
import br.edu.lista4.exe0.Gerente;

public class Main {
    public static void main(String[] args) {

        Assistente assistente1 = new Assistente("Matheus", "Franca",
                "123.456.789-3", 3000, 4);
        System.out.println(assistente1);

        Gerente gerente1 = new Gerente("Lucas", "Sales",
                "123.456.789-3", 5000, 2000);
        System.out.println(gerente1.toString());

        Diretor diretor1 = new Diretor("Paulo", "Batatais",
                "980.345.123-00", 8000, 1000);
        System.out.println(diretor1.toString());
    }
}