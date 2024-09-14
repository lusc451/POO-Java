package br.edu.lista4.exe3;

public class Radio extends Produto{
    private String banda, estacao;

    public Radio() {
        super();
    }

    public Radio(int serial, int volume, String banda, String estacao) {
        super(serial, volume);
        this.banda = banda;
        this.estacao = estacao;
    }

    public void escutar() {
        System.out.println("Estou escutando a estação " + estacao + " da banda " + banda);
    }

    public void trocaEstacao(String estacao) {
        this.estacao = estacao;
        System.out.println("Estou escutando a estação " + estacao + " da banda " + banda);
    }

    public void trocaBanda(String banda) {
        this.banda = banda;
        System.out.println("Estou escutando a estação " + estacao + " da banda " + banda);
    }

    @Override
    public String toString(){
        return super.toString() + "Radio{" +
                "banda='" + banda + '\'' +
                ", estacao='" + estacao + '\'' +
                '}';
    }

}
