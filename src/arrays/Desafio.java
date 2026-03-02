package arrays;

import javax.swing.*;

public class Desafio {

    public static void main(String[] args) {

        double notas[] = new double[Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas que terá a lista: "))];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (i + 1) + ": "));
            if (notas[i] < 0.0 || notas[i] > 10.0) {
                System.out.println("Nota inválida, tente novamente.");
                i--;
            }
        }

        double total = 0;
        for (double nota: notas) {
            total += nota;
        }
        double media= total / notas.length;
        System.out.println("Total: " + media);
    }

}
