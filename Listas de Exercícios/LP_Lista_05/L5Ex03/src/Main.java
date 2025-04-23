import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int sizeArray = 10;
        int [] randomArray = new int[sizeArray];

        // Adicionando os valores de forma aleatória
        for(int i=0; i<sizeArray; i++){
            randomArray[i] = random.nextInt(101);
        }

        System.out.println("Digite um número: \n");
        int num = in.nextInt();
        String resultado = resultado = "O número não consta no vetor.";

        for (int j=0; j<sizeArray; j++) {
            if (num == randomArray[j]) {
                resultado = "O número digitado consta no vetor, na posição " + j;
                break;
            }

        }
        System.out.println(resultado);
    }
}