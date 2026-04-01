package DesafioSistemaBiblioteca;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Emprestimo {

    private Date data;
    private Membro membro;

    private List<Livro> livroEmprestado;

    public Emprestimo(Date data, Membro membro) {
        this.data = data;
        this.membro = membro;
        this.livroEmprestado = new ArrayList<>();
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public List<Livro> getLivroEmprestado() {
        return livroEmprestado;
    }

    public void setLivroEmprestado(List<Livro> livroEmprestado) {
        this.livroEmprestado = livroEmprestado;
    }

    public void adicionarLivroEmprestado(Livro livro){
        this.livroEmprestado.add(livro);
    }

    public double calcularMulta(int diasAtraso){
        double total = 0;

            for (Livro livro : livroEmprestado) {
                total += 1.5 * diasAtraso;
            }
        return total;
    }

    public String toString(){
        return ("Data: " + data +
                "\nMembro: " + membro +
                "\nLivros Emprestados: " + livroEmprestado);
    }

}
