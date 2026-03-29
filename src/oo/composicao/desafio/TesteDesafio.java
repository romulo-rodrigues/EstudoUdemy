package oo.composicao.desafio;

import java.util.Date;

public class TesteDesafio {

    public static void main(String[] args) {

        Cliente c1 = new Cliente(1, "João", "email@email.com.br");
        Cliente c2 = new Cliente(2, "Rayssa", "rayssafranciscarayssa@gmail.com.br");

        Produto p1 = new Produto(1, "Carne de gado", 30.52, 5);
        Produto p2 = new Produto(2, "Cachorro quente", 15.50, 1);
        Produto p3 = new Produto(2, "Ovo", 12.50, 50);

        Compra cm1 = new Compra(1, new Date(), c1);
        Compra cm2 = new Compra(2, new Date(), c2);
        Compra cm3 = new Compra(3, new Date(), c2);

        cm1.adicionarItem(new Item(1, 4, p1));
        cm2.adicionarItem(new Item(2, 3, p2));
        cm3.adicionarItem(new Item(3, 5, p3));


        System.out.println("--- Compra 1 ---");
        System.out.println(cm1);
        System.out.println("Total da compra: " + cm1.calcularTotal());

        System.out.println("\n--- Compra 2 ---");
        System.out.println(cm2);
        System.out.println("Total da compra: " + cm2.calcularTotal());

        System.out.println("\n--- Compra 3 ---");
        System.out.println(cm3);
        System.out.println("Total da compra: " + cm3.calcularTotal());

    }

}
