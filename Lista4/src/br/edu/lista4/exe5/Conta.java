package br.edu.lista4.exe5;

public class Conta {
    private String nomeCliente;
    private float salarioCliente, saldo, limite;
    private int numeroConta;

    public Conta() {
    }

    // Construtor
    public Conta(String nomeCliente, float salarioCliente, int numeroConta, float saldoInicial, float limite) {
        this.nomeCliente = nomeCliente;
        this.salarioCliente = salarioCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;

        // O limite não pode ser maior que o salário do cliente
        if (limite > salarioCliente) {
            this.limite = salarioCliente;
        } else {
            this.limite = limite;
        }
    }

    // Método para realizar depósito
    public void deposito(float valor) {
        this.saldo += valor;
    }

    // Método para realizar retirada
    public boolean retira(float valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            return true;
        } else {
            return false; // Saldo insuficiente
        }
    }

    // Método para retornar o saldo
    public float saldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", salarioCliente=" + salarioCliente +
                ", numeroConta=" + numeroConta +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
