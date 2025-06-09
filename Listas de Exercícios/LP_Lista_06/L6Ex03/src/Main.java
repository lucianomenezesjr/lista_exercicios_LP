import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número a ser elevado: "));
    int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da potência: "));

    potencia(x, y);

    int pot = potenciaRecursiva(x, y);
    System.out.println(x + " elevado a " + y + " é " + pot);


    }

    public static int potencia(int x, int y){
        int resultado = 1;
        if ( y >= 0){
            for (int i=0; i<y; i++){

                resultado *= x;
            }
        }
        System.out.println( x + " elevado a " + y + " é " + resultado);
        return resultado;
    }

    public static int potenciaRecursiva(int x, int y) {
        if (y == 0) {
            return 1;
        }
        return x * potenciaRecursiva(x, y - 1);
    }
}