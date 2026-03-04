package Arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        double[] notasAlunosA = new double[3];
        notasAlunosA[0] = 7.9;
        notasAlunosA[1] = 8;
        notasAlunosA[2] = 6.7;

        /* Pode ser feito desta forma:
        Arrays.toString(notasAlunosA); */

        // Ou desta forma:
        System.out.println(Arrays.toString(notasAlunosA));

        double total = 0;
        for(int i = 0; i < notasAlunosA.length; i++){
            total += notasAlunosA[i];
        }
        System.out.println(String.format("%.2f", total / notasAlunosA.length));

        double[] notasAlunosB = {6.9, 8.5, 7.3};

        double totalb = 0;
        for(int i = 0; i < notasAlunosB.length; i++){
            totalb += notasAlunosB[i];
        }
        System.out.println(String.format("%.2f", totalb / notasAlunosB.length));
    }

}


