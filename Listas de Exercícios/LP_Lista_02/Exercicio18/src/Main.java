import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double coeficienteA = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente a: "));
        double coeficienteB = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente b: "));

        double resultado = -coeficienteB/coeficienteA;
        JOptionPane.showMessageDialog(null, "Solução da equação do primeiro grau é " + resultado);
    }
}