import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double num = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        double resultado = num/5;
        JOptionPane.showMessageDialog(null,"A quinta parte de "+ num + " é " + resultado);
    }
}