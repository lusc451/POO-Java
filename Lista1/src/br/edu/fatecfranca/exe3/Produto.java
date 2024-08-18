package br.edu.fatecfranca.exe3;

public class Produto {
    public int id, qtde;
    public String descricao;
    public float preco;

    public Produto() {
    }

    public Produto(int id, int qtde, String descricao, float preco) {
        this.id = id;
        this.qtde = qtde;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void comprar(int x){
        this.qtde+= x;
    }

    public void vender(int x){
        if(this.qtde - x >= 0){
            this.qtde-=x;
        }
        else {
            System.out.println("Estoque não pode ficar negativo");
        }
    }

    public void subir(float x){
        this.preco += x;
    }

    public void descer(float x){
        if(this.preco - x >= 0){
            this.preco-=x;
        }
        else {
            System.out.println("Preço não pode ficar negativo");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", qtde=" + qtde +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}