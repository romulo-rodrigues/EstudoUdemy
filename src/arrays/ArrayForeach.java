package arrays;

public class ArrayForeach {

    public void main (String[] args){

        double[] notas = {6.9, 8.5, 7.3};

        for(int i = 0; i< notas.length; i++){
            System.out.print(notas[i] + " ");
        }

        System.out.println();

        for(double nota:notas){
            System.out.print(nota + " ");
        }

    }

}
