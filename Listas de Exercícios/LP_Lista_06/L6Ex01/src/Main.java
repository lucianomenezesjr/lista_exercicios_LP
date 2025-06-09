import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        contador(num);
        int soma = contadorRecursivo(num);
        System.out.println("Soma recursiva: " + soma);
    }

    public static int contador(int n){

        int somaDeTodosValores = 0;
        if( n > 0){
            for (int i=1; i<=n; i++){

                somaDeTodosValores += i;
            }
        }
        System.out.println(somaDeTodosValores);
        return somaDeTodosValores;
    }

    public static int contadorRecursivo(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + contadorRecursivo(n - 1);
    }
}