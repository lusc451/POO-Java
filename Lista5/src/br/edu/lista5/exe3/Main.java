package br.edu.lista5.exe3;

import br.edu.lista5.exe3.classes.Gato;
import br.edu.lista5.exe3.classes.GatoAdapter;
import br.edu.lista5.exe3.interfaces.Animal;

public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Rengar");
        Gato gato2 = new Gato("Katarina");

        Animal gatoAdaptado1 = new GatoAdapter(gato1);
        Animal gatoAdaptado2 = new GatoAdapter(gato2);

        gatoAdaptado1.fazerSom();
        gatoAdaptado2.fazerSom();

        System.out.println();
    }
}
