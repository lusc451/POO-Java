import br.edu.fatecfranca.exe0.Compra;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Compra obj1 = new Compra(200, 2, "Aprovado");
        System.out.println(obj1);

        Compra obj2 = new Compra();
        obj2.setQtd(-10);
        obj2.setValor(-200);
        obj2.setSituacao("Bugada");
        System.out.println(obj2);

        Compra obj3 = new Compra();
        obj3.setQtd(10);
        obj3.setValor(10);
        obj3.setSituacao("Aprovado");
        System.out.println(obj3);

        System.out.println("Quantidade de obj1" + obj1.getQtd());
    }
}