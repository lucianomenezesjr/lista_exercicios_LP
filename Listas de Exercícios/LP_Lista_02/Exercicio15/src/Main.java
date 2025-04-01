import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do raio: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura: "));
        double volumeCilindro = Math.PI * Math.pow(raio, 2.0) * altura;

        JOptionPane.showMessageDialog(null, "O volume do cilindro é " + volumeCilindro);
    }
}