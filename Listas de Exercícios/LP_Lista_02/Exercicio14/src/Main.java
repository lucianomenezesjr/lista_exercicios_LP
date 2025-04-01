import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho da base: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));

        double area = (base * altura)/2;

        JOptionPane.showMessageDialog(null, "A média das notas é " + area);
    }
}