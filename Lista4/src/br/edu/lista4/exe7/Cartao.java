package br.edu.lista4.exe7;

import br.edu.lista4.exe5.Conta;

public class Cartao {
    private Conta conta;
    private String senha;

    public Cartao() {
    }

    // Construtor que recebe uma conta e a senha do cartão
    public Cartao(Conta conta, String senha) {
        this.conta = conta;
        this.senha = senha;
    }

    // Método para realizar retirada, verificando a senha
    public boolean retirada(float valor, String senhaDigitada) {
        if (senha.equals(senhaDigitada)) {
            return conta.retira(valor);  // Chama o método retira da classe Conta
        } else {
            System.out.println("Senha incorreta.");
            return false;
        }
    }

    // Método para retornar o saldo da conta, verificando a senha
    public float saldo(String senhaDigitada) {
        if (senha.equals(senhaDigitada)) {
            return conta.saldo();  // Chama o método saldo da classe Conta
        } else {
            System.out.println("Senha incorreta.");
            return -1;  // Retorna um valor negativo para indicar erro
        }
    }

    // Método para alterar a senha, verificando a senha antiga
    public boolean alterarSenha(String senhaAntiga, String novaSenha) {
        if (senha.equals(senhaAntiga)) {
            this.senha = novaSenha;
            return true;
        } else {
            System.out.println("Senha antiga incorreta.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "conta=" + conta +
                ", senha='" + senha + '\'' +
                '}';
    }
}
