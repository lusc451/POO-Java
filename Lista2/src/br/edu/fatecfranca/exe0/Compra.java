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

    public void setValor(float valor) {
        if(valor >= 0){
            this.valor = valor;
        }
        else {
            System.out.println("Valor inválido");
            this.valor = 0;
        }
    }

    public void setQtd(int qtd) {
        if(qtd >= 0){
            this.qtd = qtd;
        }
        else {
            System.out.println("Quantidade inválida");
            this.qtd = 0;
        }
    }
    public void setSituacao(String situacao) {
        if(situacao.equals("Aprovado") || situacao.equals("Reprovado") || situacao.equals("Pendente")){
            this.situacao = situacao;
        }
        else {
            System.out.println("Situação inválida");
            this.situacao = "Reprovado";
        }
    }

    //getters
    public float getValor() {
        return valor;
    }
    public int getQtd() {
        return qtd;
    }
    public String getSituacao() {
        return situacao;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "valor=" + valor +
                ", qtd=" + qtd +
                ", situacao='" + situacao + '\'' +
                '}';
    }
}