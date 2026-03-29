package oo.composicao.desafio;

public class Cliente {

    private int idClient;
    private String nome;
    private String email;

    public Cliente(int idClient, String nome, String email) {
        this.idClient = idClient;
        this.nome = nome;
        this.email = email;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "ID Cliente: " + idClient + ", nome: " + nome + ", email: " + email;
    }
}
