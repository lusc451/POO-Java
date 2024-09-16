package br.edu.lista4.teste;

import br.edu.lista4.exe5.Conta;

public class MainConta {
    public static void main(String[] args) {

        Conta conta1 = new Conta("Lucas Antunes", 3000.0f, 123456, 500.0f, 2000.0f);
        System.out.println(conta1);

        // Realizando um depósito
        conta1.deposito(1000.0f);
        System.out.println("\nApós depósito de R$ 1000,00:");
        System.out.println(conta1);

        // Tentando realizar uma retirada que o cliente pode fazer
        boolean retirada1 = conta1.retira(2500.0f);
        System.out.println("\nTentando retirar R$ 2500,00: " + (retirada1 ? "Retirada bem-sucedida" : "Saldo insuficiente"));
        System.out.println(conta1);

        // Tentando realizar uma retirada que o cliente não pode fazer
        boolean retirada2 = conta1.retira(4000.0f);
        System.out.println("\nTentando retirar R$ 4000,00: " + (retirada2 ? "Retirada bem-sucedida" : "Saldo insuficiente"));
        System.out.println(conta1);

        // Mostrando o saldo final
        System.out.println("\nSaldo atual: R$ " + conta1.saldo());
    }
}

