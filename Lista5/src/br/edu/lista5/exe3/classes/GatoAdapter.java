package br.edu.lista5.exe3.classes;

import br.edu.lista5.exe3.interfaces.Animal;

public class GatoAdapter implements Animal {
    
    private Gato gato;

    public GatoAdapter(Gato gato) {
        this.gato = gato;
    }

    @Override
    public void fazerSom() {
        this.gato.miar();  // Chama o método miar do Gato
    }
}
