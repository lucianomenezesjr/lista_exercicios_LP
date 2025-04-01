import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double milhas = Double.parseDouble(JOptionPane.showInputDialog("Digite uma distância em km: "));
        double km = milhas / 0.621371;

        JOptionPane.showMessageDialog(null, "A conversão de " + milhas + "milhas para km é " + km);

    }
}