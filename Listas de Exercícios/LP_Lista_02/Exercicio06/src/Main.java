import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double velocidadeM = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade em m/s: "));
        double velocidadeKm = velocidadeM*3.6;

        JOptionPane.showMessageDialog(null, "A conversão de " + velocidadeM + "m/s para km/h é " + velocidadeKm);
    }
}