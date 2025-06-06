import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        contador(num);
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
}