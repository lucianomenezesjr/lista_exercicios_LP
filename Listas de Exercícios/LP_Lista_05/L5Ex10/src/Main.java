import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int multiAux = 0;
        int posicao00 = 0;
        int [] linha01 = new int[2];

        int[][] matrizA = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int[][] matrizB = {
                {1, 2},
                {3, 4}
        };

        int[][] matrizC = new int[3][2];


        for (int i=0; i<matrizA.length; i++){



            for (int j=0; j<matrizB[0].length; j++){

                for (int k=0; k<matrizA[0].length; k++){
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];



                }

            }
        }
        System.out.println(Arrays.deepToString(matrizC));

    }
}