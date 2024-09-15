package br.edu.lista4.exe3;

public abstract class Produto {
    protected int numeroSerial, volume;
    protected String statusTeste = "Não testado";
    protected boolean testado;

    public Produto() {
    }

    // Construtor da classe Produto
    public Produto(int numeroSerial, int volume) {
        this.numeroSerial = numeroSerial;
        this.volume = volume;
    }

    // Método testaUnidade - só pode ser executado uma vez
    public boolean testaUnidade() {
        if (!testado) {
            double chance = Math.random();
            testado = true;
            if (chance <= 0.9) { // 90% de chance de ser aprovado
                statusTeste = "Aprovado";
                return true;
            } else {
                statusTeste = "Reprovado";
                return false;
            }
        } else {
            System.out.println("O produto já foi testado.");
            return false;
        }
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
