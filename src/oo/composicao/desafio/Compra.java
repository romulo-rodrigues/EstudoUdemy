package oo.composicao.desafio;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Compra {

    private int idCompra;
    private Date data;
    private Cliente cliente;

    private List<Item> itens;

    public Compra(int idCompra, Date data, Cliente cliente) {
        this.idCompra = idCompra;
        this.data = data;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    @Override
    public String toString() {
        return "ID Compra: " + idCompra +
                "\nData: " + data +
                "\nComprador: " + cliente +
                "\nItens da compra: " + itens;
    }

    public double calcularTotal(){
        double total = 0;
        for(Item item : itens){
            total += item.getPreco() * item.getQuantidade();
        }
        return total;
    }
}
