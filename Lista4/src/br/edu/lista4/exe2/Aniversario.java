package br.edu.lista4.exe2;

public class Aniversario extends CartaoWeb{

    public Aniversario(){
        super();
    }

    public Aniversario(String destinatario){
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Aniversário " + getDestinatario());
    }
}
