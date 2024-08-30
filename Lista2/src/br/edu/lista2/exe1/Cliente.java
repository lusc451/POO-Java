package br.edu.lista2.exe1;

public class Cliente {
    private String nrConta, nrAgencia, nome;
    private float saldo;

    public Cliente() {
        this.nrConta = "não informado";
        this.nrAgencia = "não informado";
        this.nome = "não informado";
        this.saldo = 0;
    }

    public Cliente(String nrConta, String nrAgencia, String nome, float saldo) {
        this.setNrConta(nrConta);
        this.setNrAgencia(nrAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public void depositar(float x){
        this.setSaldo(this.saldo + x);
    }

    public void sacar(float x){
        this.setSaldo(this.saldo - x);
    }

    public void setNrConta(String nrConta) {
        if (nrConta.length() == 8) {
            if (nrConta.charAt(6) == '-') {
                this.nrConta = nrConta;
            }
            else {
                this.nrConta = "";
                System.out.println("Traço incorreto");
            }
        }
        else {
            System.out.println("Tamanho diferente de 8");
        }
    }

    public void setNrAgencia(String nrAgencia) {
        if (nrAgencia.length() == 6) {
            if (nrAgencia.charAt(4) == '-'){
                this.nrAgencia = nrAgencia;
            }
            else{
                this.nrAgencia = "";
                System.out.println("Traço incorreto");
            }
        }
        else System.out.println("Tamanho diferente de 8");
    }

    public void setNome(String nome) {
        if (nome.length() <= 30){
            this.nome = nome;
        }
        else{
            this.nome = "";
            System.out.println("Tamanho maior que 30 não é possível");
        }
    }

    public void setSaldo(float saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }
        else System.out.println("Saque não permitido");
    }

    public String getNrConta() {
        return nrConta;
    }

    public String getNrAgencia() {
        return nrAgencia;
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nrConta='" + nrConta + '\'' +
                ", nrAgencia='" + nrAgencia + '\'' +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
