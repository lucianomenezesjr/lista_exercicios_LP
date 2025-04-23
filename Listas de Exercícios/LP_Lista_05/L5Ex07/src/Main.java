import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] somaLinhas = new int[5];
        int [] somaColunas = new int[5];

        int maiorSomaLinha = somaLinhas[0];
        int maiorSomaColuna = somaLinhas[0];

        int somaLinha = 0;
        int somaColuna = 0;
        int[][] matriz = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        //Calcula a soma entre linhas
        for(int i=0; i< matriz.length; i++){
            for(int j=0; j< matriz.length; j++){
                somaLinha = somaLinha + matriz[i][j];
            }
            somaLinhas[i] = somaLinha;

            if (somaLinhas[i] >= maiorSomaLinha) {
                maiorSomaLinha = somaLinhas[i];
            }

            somaLinha = 0;

        }

        //Calcula a soma entre coluna
        for(int k=0; k< matriz.length; k++){
            for(int l=0; l< matriz.length; l++){
                somaColuna += matriz[l][k];
            }
            somaColunas[k] = somaColuna;

            if (somaColunas[k] >= maiorSomaColuna) {
                maiorSomaColuna = somaColunas[k];
            }

            somaColuna = 0;

        }


        System.out.println("Soma das linhas: " + Arrays.toString(somaLinhas) + "\nMaior valor das somas das linhas: " + maiorSomaLinha);
        System.out.println("Soma das Colunas: " + Arrays.toString(somaColunas) + "\nMaior valor das somas das colunas: " + maiorSomaColuna);



    }
}