import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] vetor = new int[5];

        int [] numbers = {2,5,6,4,8};

        vetor[0] = 100;
        vetor[1] = 50;


        //for(int i=0; i<numbers.length; i++){
            //System.out.println(numbers[i]);
        //}

        int [][] matrizes = {   {1,2},
                                {3,4},
                                {5,6}};
        String matrizStrCompleta = "";
        String strAux = "";
        for (int i = 0; i < matrizes.length; i++) {
            int[] linhaAtual = matrizes[i]; // linhaAtual é um array de inteiros

            for(int j=0; j<linhaAtual.length; j++){
                strAux += " " + Integer.toString(linhaAtual[j]) + " | ";

                if(j < linhaAtual.length - 1) {
                    strAux += " | ";
                }
            }
            matrizStrCompleta += strAux + "\n";
            strAux = "";

        }
        System.out.println("Matriz: \n" + matrizStrCompleta);

    }
}