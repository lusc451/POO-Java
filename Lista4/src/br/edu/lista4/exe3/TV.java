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

    public String assistir() {
        return "Estou assistindo o canal " + canal;
    }

    public void trocaCanal(String canal) {
        this.canal = canal;
    }

    @Override
    public String toString(){
        return super.toString() + "TV{" +
                "canal='" + canal + '\'' +
                '}';
    }
}
