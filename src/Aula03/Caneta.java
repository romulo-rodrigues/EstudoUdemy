package Aula03;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO!!! Não é possivel rabiscar com a caneta tamapada.");
        }else {
            System.out.println("Rabiscando...");
        }
    }
}
