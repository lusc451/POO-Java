package br.edu.fatecfranca.teste;

import br.edu.fatecfranca.exe4.Rio;

public class MainRio {
    public static void main(String[] args) {
        Rio obj1 = new Rio("Rio Tietê", 10.0f, false);
        obj1.chover(5.0f);
        obj1.ensolarar(3.0f);
        obj1.limpar();
        obj1.sujar();
        System.out.println(obj1);

        Rio obj2 = new Rio("Rio Paraná", 20.0f, true);
        obj2.chover(5.0f);
        obj2.ensolarar(3.0f);
        obj2.limpar();
        obj2.sujar();
        System.out.println(obj2);

        Rio obj3 = new Rio("Rio Amazonas", 30.0f, false);
        obj3.chover(5.0f);
        obj3.ensolarar(3.0f);
        obj3.limpar();
        obj3.sujar();
        System.out.println(obj3);
    }
}
