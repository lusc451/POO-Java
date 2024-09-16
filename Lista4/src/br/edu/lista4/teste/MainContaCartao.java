package br.edu.lista4.teste;

import br.edu.lista4.exe5.Conta;
import br.edu.lista4.exe7.Cartao;

public class MainContaCartao {
    public static void main(String[] args) {
        Conta conta = new Conta("Carlos Almeida", 4000.0f, 987654, 1000.0f, 3000.0f);
        Cartao cartao = new Cartao(conta, "1234");

        System.out.println(cartao);

        // Tentando verificar o saldo com a senha correta
        System.out.println("\nSaldo com senha correta (1234): R$ " + cartao.saldo("1234"));

        // Tentando verificar o saldo com a senha incorreta
        System.out.println("\nSaldo com senha incorreta (0000): R$ " + cartao.saldo("0000"));

        // Realizando uma retirada com a senha correta
        boolean retirada1 = cartao.retirada(500.0f, "1234");
        System.out.println("\nTentando retirar R$ 500,00 com senha correta: " + (retirada1 ? "Retirada bem-sucedida" : "Falha na retirada"));
        System.out.println(cartao);

        // Tentando uma retirada com a senha incorreta
        boolean retirada2 = cartao.retirada(1000.0f, "0000");
        System.out.println("\nTentando retirar R$ 1000,00 com senha incorreta: " + (retirada2 ? "Retirada bem-sucedida" : "Falha na retirada"));
        System.out.println(cartao);

        // Alterando a senha do cartão
        boolean alteracaoSenha = cartao.alterarSenha("1234", "5678");
        System.out.println("\nTentativa de alterar senha para '5678': " + (alteracaoSenha ? "Senha alterada com sucesso" : "Falha ao alterar senha"));

        // Tentando realizar retirada com a nova senha
        boolean retirada3 = cartao.retirada(300.0f, "5678");
        System.out.println("\nTentando retirar R$ 300,00 com nova senha (5678): " + (retirada3 ? "Retirada bem-sucedida" : "Falha na retirada"));
        System.out.println(cartao);
    }
}
