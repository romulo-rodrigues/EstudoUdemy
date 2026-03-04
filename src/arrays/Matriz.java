package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

    public void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int qtdAlunos = sc.nextInt();

        System.out.println("Quantas notas por aluno? ");
        int qtdNotas = sc.nextInt();


        double[][] notasTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for(int a = 0; a < notasTurma.length; a++){
            for (int n = 0; n < notasTurma[a].length; n++){

                System.out.printf("Informe a nota %d do aluno %d ", n + 1, a + 1);

                notasTurma[a][n] = sc.nextDouble();
                total += notasTurma[a][n];
            }
        }

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("A média da turma é " + media);

        for (double[] notasAluno : notasTurma){
            System.out.println(Arrays.toString(notasAluno));
        }

        sc.close();
    }
}
