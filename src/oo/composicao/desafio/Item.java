package oo.composicao.desafio;

public class Item {

    private int idItem;
    private int quantidade;
    private Produto produto;
    private double preco;

    public Item(int idItem, int quantidade, Produto produto, double preco) {
        this.idItem = idItem;
        this.quantidade = quantidade;
        this.produto = produto;
        this.preco = preco;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Item id: " + idItem + ", quantidade: " + quantidade + ", preco: " + preco + ", produto: " + produto.getNomeProd();
    }
}
