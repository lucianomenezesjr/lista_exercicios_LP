import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double velocidadeKm = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade em km/h: "));
        double velocidadeM = velocidadeKm/3.6;

        JOptionPane.showMessageDialog(null, "A conversão de " + velocidadeKm + "km/h para m/s é " + velocidadeM + "m/s");
    }
}