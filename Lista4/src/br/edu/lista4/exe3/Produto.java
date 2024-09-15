package br.edu.lista4.exe3;

public class Produto {
    private int numeroSerial, volume;
    private String statusTeste = "Não testado";

    public Produto() {
    }

    // Construtor da classe Produto
    public Produto(int numeroSerial, int volume) {
        this.numeroSerial = numeroSerial;
        this.volume = volume;
    }

    // Método testaUnidade - só pode ser executado uma vez
    public boolean testaUnidade() {

        double chance = Math.random(); // Gera um número de 0.0 a 1.0

        if (chance <= 0.9) { // 90% de chance de estar OK
            statusTeste = "Aprovado";
            return true;
        } else {
            statusTeste = "Reprovado";
            return false;
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "numeroSerial=" + numeroSerial +
                ", volume=" + volume +
                ", statusTeste='" + statusTeste + '\'' +
                '}';
    }
}
