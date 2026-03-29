package oo.composicao.CompraAula;

import java.util.ArrayList;

public class Compra {

    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    // Relacionamento bidimensional
    void adicionarItem(String nome, int qntd, double preco){
        this.adicionarItem(new Item(nome, qntd, preco));
    }

    void adicionarItem(Item item){
        this.itens.add(item);
        item.compra = this;
    }

    double obterValorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.qntd * item.preco;
        }
        return total;
    }
}
