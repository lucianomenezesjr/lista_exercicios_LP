import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double coeficienteA = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente a: "));
        double coeficienteB = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente b: "));
        double coeficienteC = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente c: "));

        double delta = ((Math.pow(coeficienteB, 2)) - (4*coeficienteA*coeficienteC));

        double x1 = ((-(coeficienteB)) + Math.sqrt(delta))/(2*coeficienteA);
        double x2 = ((coeficienteB) + Math.sqrt(delta))/(2*coeficienteA);
        JOptionPane.showMessageDialog(null, "Solução da equação do segundo grau são x1 = " + x1 + "x2 = " + x2);
    }
}