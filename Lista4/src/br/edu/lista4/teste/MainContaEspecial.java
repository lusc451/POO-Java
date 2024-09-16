package br.edu.lista4.teste;

import br.edu.lista4.exe6.ContaEspecial;

public class MainContaEspecial {
    public static void main(String[] args) {
        ContaEspecial contaEspecial1 = new ContaEspecial("Maria Souza", 5000.0f, 789101, 1500.0f, 20000.0f);
        System.out.println(contaEspecial1);

        // Realizando um depósito
        contaEspecial1.deposito(5000.0f);
        System.out.println("\nApós depósito de R$ 5000,00:");
        System.out.println(contaEspecial1);

        // Tentando realizar uma retirada que o cliente pode fazer
        boolean retirada1 = contaEspecial1.retira(12000.0f);
        System.out.println("\nTentando retirar R$ 12000,00: " + (retirada1 ? "Retirada bem-sucedida" : "Saldo insuficiente"));
        System.out.println(contaEspecial1);

        // Tentando realizar uma retirada que o cliente não pode fazer
        boolean retirada2 = contaEspecial1.retira(20000.0f);
        System.out.println("\nTentando retirar R$ 20000,00: " + (retirada2 ? "Retirada bem-sucedida" : "Saldo insuficiente"));
        System.out.println(contaEspecial1);

        // Mostrando o saldo final
        System.out.println("\nSaldo atual: R$ " + contaEspecial1.saldo());
    }
}

