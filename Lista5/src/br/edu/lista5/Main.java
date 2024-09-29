package br.edu.lista5;

import br.edu.lista5.exe0.classes.Triatleta;
import br.edu.lista5.exe0.interfaces.JogadorFutebol;

public class Main {
    public static void main(String[] args) {
        JogadorFutebol futebolista;

        // Triatleta executando todos os métodos das interfaces
        Triatleta triatleta = new Triatleta("Lucas Antunes");
        triatleta.manchete();
        triatleta.cobrarEscanteio();
        triatleta.darToco();

        // Quando a sobrescrição ocorrer em cima de uma variável tipada com a interface, como é o caso do futebolista,
        // a classe só poderá executar os métodos da interface que foi tipada, e mais nenhuma outra.
        futebolista = new Triatleta("João");
        futebolista.baterPenalti();
        futebolista.cobrarEscanteio();
        // futebolista.manchete(); <== Isso aqui não vai dar certo!

    }
}