package oo.composicao.desafio;

public class Produto {

    private int idProduto;
    private String nomeProd;
    private double precoProd;
    private int estoqueProd;

    public Produto(int idProduto, String nomeProd, double precoProd, int estoqueProd) {
        this.idProduto = idProduto;
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
        this.estoqueProd = estoqueProd;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getPrecoProd() {
        return precoProd;
    }

    public void setPrecoProd(double precoProd) {
        this.precoProd = precoProd;
    }

    public int getEstoqueProd() {
        return estoqueProd;
    }

    public void setEstoqueProd(int estoqueProd) {
        this.estoqueProd = estoqueProd;
    }
}
