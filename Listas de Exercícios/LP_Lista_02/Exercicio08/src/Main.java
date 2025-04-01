import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double polegadas = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em polegadas: "));
        double milimetro = polegadas/25.4;

        JOptionPane.showMessageDialog(null, "A conversão de " + polegadas + "polegadas para milímetros é " + milimetro);
    }
}