package br.edu.fatecfranca.exe2;

public class Cliente {
    public int numConta, numAgencia;
    public String nome;
    public float saldo;

    public Cliente(){
    }

    public Cliente(int numConta, int numAgencia, String nome, float saldo) {
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void depositar(float x){
        this.saldo += x;
    }

    public void sacar(float x){
        if(this.saldo - x >= 0){
            this.saldo -= x;
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Conta: " + numConta +
                ", Agencia: " + numAgencia +
                ", Nome: '" + nome + '\'' +
                ", Saldo: " + saldo +
                '}';
    }
}
