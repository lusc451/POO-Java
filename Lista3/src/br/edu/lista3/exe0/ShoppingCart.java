package br.edu.lista3.exe0;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart {
    private int id;
    private Date date;
    private String destino;
    private String formaPagamento;
    private float precoTotal;
    //composição
    private List<CarItem> carItens;



    public ShoppingCart() {
        this.carItens = new ArrayList<CarItem>(); //aloca espaço no vetor
    }

    public ShoppingCart(int id, Date date, String destino, String formaPagamento, float precoTotal) {
        this.id = id;
        this.date = date;
        this.destino = destino;
        this.formaPagamento = formaPagamento;
        this.precoTotal = precoTotal;
        this.carItens = new ArrayList<CarItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public List<CarItem> getCarItens() {
        return carItens;
    }

    //adiciona um item no carrinho de compra
    public void addCarItem(int id, int quantity, Product product){
        this.carItens.add(new CarItem(id, quantity, product));
    }

    public void calculateTotalPrice(){
        float soma = 0;
        for (CarItem carItem : carItens) {
            soma += carItem.getQuantity() * carItem.getProduct().getPrice();
        }
        this.precoTotal = soma;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", date=" + date +
                ", destino='" + destino + '\'' +
                ", formaPagamento='" + formaPagamento + '\'' +
                ", precoTotal=" + precoTotal +
                ", carItens=" + carItens +
                '}';
    }
}
