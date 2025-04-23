public class Main {
    public static void main(String[] args) {
        // Declarando e inicializando uma matriz 3x3
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int a = matriz[0][0], b = matriz[0][1], c = matriz[0][2];
        int d = matriz[1][0], e = matriz[1][1], f = matriz[1][2];
        int g = matriz[2][0], h = matriz[2][1], i = matriz[2][2];

        int determinante = a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);


        System.out.println("Matriz 3x3:");
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz[j].length; k++) {
                System.out.print(matriz[j][k] + " ");
            }
            System.out.println();
        }

        System.out.println("A determinante da matriz anterior é " + determinante);

    }
}