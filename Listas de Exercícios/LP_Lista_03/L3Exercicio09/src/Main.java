import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado:"));

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
            } else if (a == b || a == c || b == c) {
                JOptionPane.showMessageDialog(null, "Triângulo Isósceles");
            } else {
                JOptionPane.showMessageDialog(null, "Triângulo Escaleno");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Estes valores não formam um triângulo!");
        }
    }
}