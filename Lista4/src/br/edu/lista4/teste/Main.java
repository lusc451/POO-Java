package br.edu.lista4.teste;
import br.edu.lista4.exe0.Assistente;
import br.edu.lista4.exe0.Diretor;
import br.edu.lista4.exe0.Gerente;
import br.edu.lista4.exe0.Funcionario;

import java.util.ArrayList;

public class Main {

    public static void calculaFolhaSalarial(ArrayList<Funcionario> funcionarios){
        float total = 0;
        for(Funcionario func : funcionarios){
            total += func.calculaSalario(); //polimorfismo
        }
        System.out.println("Total da folha salarial: " + total);
    }

    public static void mostra(Funcionario func){
        System.out.println(func.toString());
    }

    public static void main(String[] args) {

        Assistente assistente1 = new Assistente("Matheus", "Franca",
                "123.456.789-3", 3000, 4);
        mostra(assistente1);

        Gerente gerente1 = new Gerente("Lucas", "Sales",
                "123.456.789-3", 5000, 2000);
        mostra(gerente1);

        Diretor diretor1 = new Diretor("Paulo", "Batatais",
                "980.345.123-00", 8000, 1000);
        mostra(diretor1);

        ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
        lista.add(assistente1);
        lista.add(gerente1);
        lista.add(diretor1);

        calculaFolhaSalarial(lista);
    }
}