import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double milimetro = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em milímetros: "));
        double polegadas = milimetro/25.4;

        JOptionPane.showMessageDialog(null, "A conversão de " + milimetro + "mm para polegadas é " + polegadas);
    }
}