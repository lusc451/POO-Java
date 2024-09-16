package br.edu.lista4.exe6;

import br.edu.lista4.exe5.Conta;

public class ContaEspecial extends Conta {

    // Construtor
    public ContaEspecial(String nomeCliente, float salarioCliente, int numeroConta, float saldoInicial, float limite) {
        // Chamando o construtor da superclasse (Conta)
        super(nomeCliente, salarioCliente, numeroConta, saldoInicial, ajustarLimite(limite, salarioCliente));
    }

    // Método estático para ajustar o limite
    private static float ajustarLimite(float limite, float salarioCliente) {
        // O limite não pode ser maior que 3x o salário do cliente
        if (limite > salarioCliente * 3) {
            return salarioCliente * 3;
        } else {
            return limite;
        }
    }

    @Override
    public String toString() {
        return "Conta Especial: " + super.toString();
    }
}
