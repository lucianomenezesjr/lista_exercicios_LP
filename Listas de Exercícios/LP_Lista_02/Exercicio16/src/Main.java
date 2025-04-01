import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do raio: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura: "));
        double volumeCone = (Math.PI * Math.pow(raio, 2.0) * altura)/3;

        JOptionPane.showMessageDialog(null, "O volume do cone é " + volumeCone);
    }
}