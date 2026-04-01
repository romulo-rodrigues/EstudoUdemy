package DesafioSistemaBiblioteca;

public class Livro {
    
    private String titulo;
    private String autor;
    private int isbn;
    private double preco;

    public Livro(String titulo, String autor, int isbn, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return isbn;
    }

    public void setISBN(int ISBN) {
        this.isbn = ISBN;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString(){
        return("Titulo: " + titulo +
                "\nAutor: " + autor +
                "\nISBN: " + isbn +
                "\nPreço: " + preco);
    }
}
