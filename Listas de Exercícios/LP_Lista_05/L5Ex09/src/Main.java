import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        int [] diagonalSecundaria = new int[5];
        int matrizSize = matriz.length;

        for (int i= matriz.length-1; i>=0; i--){
            diagonalSecundaria[i] = matriz[i][matrizSize - 1 - i];
        }
        System.out.println(Arrays.toString(diagonalSecundaria));
    }
}