import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double km = Double.parseDouble(JOptionPane.showInputDialog("Digite uma distância em km: "));
        double milhas = km * 0.621371;

        JOptionPane.showMessageDialog(null, "A conversão de " + km + "km para milhas é " + milhas);
    }
}