import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        double resultado = num*2;
        JOptionPane.showMessageDialog(null,"O dobro de " + num + " é " + resultado);

    }
}