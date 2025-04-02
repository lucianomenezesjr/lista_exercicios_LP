import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente c:"));

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            JOptionPane.showMessageDialog(null, "Não existem raízes reais!");
        } else if (delta == 0) {
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null, "Raiz única: x = " + x);
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null,
                    "Raízes:\nx₁ = " + x1 + "\nx₂ = " + x2);
        }
    }
}