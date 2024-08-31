package br.edu.lista3.teste;

import br.edu.lista3.exe0.Product;
import br.edu.lista3.exe0.ShoppingCart;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(1, "Bola de Basquete", 400f);
        Product prod2 = new Product(2, "Bola de Futebol", 300f);
        Product prod3 = new Product(3, "Bola de Vôlei", 200f);

        ShoppingCart cart1 = new ShoppingCart(1, new Date(), "Franca", "Pix", 0f);
        cart1.addCarItem(10, 2, prod1);
        cart1.addCarItem(12, 5, prod2);
        cart1.calculateTotalPrice();
    }
}