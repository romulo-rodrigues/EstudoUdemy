package DesafioSistemaBiblioteca;

import java.util.Date;

public class LivroTeste {

    public static void main(String[] args) {
        Livro l1 = new Livro("A princesa e o Sapo", "John Musker",312321312, 50.00);
        Livro l2 = new Livro("Pequeno principe", "Antoine de Saint-Exupéry",527343234, 40.00);

        Membro m1 = new Membro("Rômulo", "romulofeliperodrigues10@gmail.com", 13232);

        Emprestimo e1 = new Emprestimo(new Date(), m1);

        System.out.println("Livro 1: \n" + l1);
        System.out.println("\nLivro 2: \n" + l2);

        System.out.println("\nComprador: \n" + m1);

        e1.adicionarLivroEmprestado(l1);
        e1.adicionarLivroEmprestado(l2);
        System.out.println("Multa a ser paga: R$" + e1.calcularMulta(10));
    }
}
