import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        double resultado = Math.pow(num, 2);
        JOptionPane.showMessageDialog(null,num +" elevado ao quadrado" + " é " + resultado);
    }
}