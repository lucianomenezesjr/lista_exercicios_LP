import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double nota01 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota: "));
        double nota02 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais uma nota: "));

        double media = (nota01 + nota02)/2;

        JOptionPane.showMessageDialog(null, "A média das notas é " + media);
    }
}