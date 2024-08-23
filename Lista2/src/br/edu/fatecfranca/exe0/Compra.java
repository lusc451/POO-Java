package br.edu.fatecfranca.exe0;

public class Compra {
    private float valor;
    private int qtd;
    private String situacao;

    public Compra() {
    }

    public Compra(float valor, int qtd, String situacao) {
        this.valor = valor;
        this.qtd = qtd;
        this.situacao = situacao;
    }
}
