package br.edu.lista5.exe1;

import br.edu.lista5.exe1.classes.Pessoa;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(25,"Lucas", "12.345.423-5", "473.349.239-00");
        p1.trabalha();
        p1.getRG();
        p1.come();
        p1.getCPF();
        p1.respira();
        p1.vota();
        p1.ensina();
        p1.pagarIR();

        Pessoa p2 = new Pessoa(30,"Maria", "12.345.423-5", "473.349.239-00");
        p2.trabalha();
        p2.getRG();
        p2.come();
        p2.getCPF();
        p2.respira();
        p2.vota();
        p2.ensina();
        p2.pagarIR();
    }
}
