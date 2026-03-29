package oo.composicao.CompraAula;

public class CompraTeste {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.cliente = "Rômulo";

        // Relacionamento bidimensional
        compra1.adicionarItem("Caneta", 20, 7.50);

        compra1.adicionarItem(new Item("Borracha", 2, 2.50));
        compra1.adicionarItem(new Item("Caderno", 10, 15.50));


        System.out.println("Cliente: " + compra1.cliente);
        System.out.println("Quantida de compras: " +compra1.itens.size());
        System.out.println("VALOR TOTAL: R$" + compra1.obterValorTotal());


        //Só para mostrar a relação bidimensional
        double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
        System.out.println(total);
    }

}
