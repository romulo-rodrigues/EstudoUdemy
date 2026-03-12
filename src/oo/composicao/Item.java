package oo.composicao;

public class Item {

    // Relacionamento bidimensional
    public Compra compra;

    String nome;
    int qntd;
    double preco;

    Item(String nome, int qntd, double preco){
        this.nome = nome;
        this.qntd = qntd;
        this.preco = preco;
    }
}
