import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 10;
        int[] numeros = new int[tamanho];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }


        int maior = numeros[0];
        int menor = numeros[0];
        int posicaoMaior = 0;
        int posicaoMenor = 0;


        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicaoMaior = i;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posicaoMenor = i;
            }
        }


        System.out.println("\nResultados:");
        System.out.println("Maior número: " + maior + " (posição " + posicaoMaior + ")");
        System.out.println("Menor número: " + menor + " (posição " + posicaoMenor + ")");

        scanner.close();
    }
}