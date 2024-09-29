package br.edu.lista5.exe1;


import br.edu.lista5.exe1.classes.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(25,"Lucas", "12.234.456-7", "123.456.789-00");
        p1.respira();
        p1.come();
        p1.trabalha();
        p1.ensina();
        p1.getRG();
        p1.getCPF();
        p1.pagarIR();
        p1.vota();
    }
}