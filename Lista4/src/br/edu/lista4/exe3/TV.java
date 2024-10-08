package br.edu.lista4.exe3;

public class TV extends Produto{
    private String canal;

    public TV() {
        super();
    }

    public TV(int serial, int volume, String canal) {
        super(serial, volume);
        this.canal = canal;
    }

    public void assistir() {
        System.out.println("Estou assistindo o canal " + canal);
    }

    public void trocaCanal(String canal) {
        this.canal = canal;
        System.out.println("Estou assistindo o canal " + canal);
    }

    @Override
    public String toString(){
        return super.toString() + "TV{" +
                "canal='" + canal + '\'' +
                '}';
    }
}
