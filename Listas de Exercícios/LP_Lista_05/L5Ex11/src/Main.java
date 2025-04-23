import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dimensões da primeira matriz
        System.out.println("DIGITE AS DIMENSÕES DAS MATRIZES");
        System.out.println("--------------------------------");
        System.out.print("Número de linhas da matriz A: ");
        int linhasA = scanner.nextInt();
        System.out.print("Número de colunas da matriz A: ");
        int colunasA = scanner.nextInt();

        // Solicitar dimensões da segunda matriz
        System.out.print("\nNúmero de linhas da matriz B: ");
        int linhasB = scanner.nextInt();
        System.out.print("Número de colunas da matriz B: ");
        int colunasB = scanner.nextInt();



        // Criar as matrizes
        int[][] matrizA = new int[linhasA][colunasA];
        int[][] matrizB = new int[linhasB][colunasB];
        int[][] matrizC = new int[linhasA][colunasB];

        // Preencher a matriz A
        System.out.println("\nPREENCHER MATRIZ A (" + linhasA + "x" + colunasA + ")");
        System.out.println("-----------------------------");
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasA; j++) {
                System.out.printf("Elemento A[%d][%d]: ", i, j);
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Preencher a matriz B
        System.out.println("\nPREENCHER MATRIZ B (" + linhasB + "x" + colunasB + ")");
        System.out.println("-----------------------------");
        for (int i = 0; i < linhasB; i++) {
            for (int j = 0; j < colunasB; j++) {
                System.out.printf("Elemento B[%d][%d]: ", i, j);
                matrizB[i][j] = scanner.nextInt();
            }
        }

        // Multiplicar as matrizes
        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        // Exibir o resultado formatado
        System.out.println("\nMATRIZ RESULTANTE C (" + linhasA + "x" + colunasB + ")");
        System.out.println("----------------------------------");
        for (int i = 0; i < linhasA; i++) {
            System.out.print("| ");
            for (int j = 0; j < colunasB; j++) {
                System.out.printf("%4d ", matrizC[i][j]);
            }
            System.out.println("|");
        }

        scanner.close();
    }
}