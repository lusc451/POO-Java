package br.edu.lista4.exe4;

public abstract class Coisa {
    // Método para determinar se o objeto atual vence o outro
    public abstract int vence(Coisa outra); // Retorna 1 se o jogador 1 vencer, -1 se perder, 0 para empate
    public abstract String getNome();
}
