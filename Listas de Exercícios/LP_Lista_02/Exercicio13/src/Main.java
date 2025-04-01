import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida do raio: "));
        double areaCirculo = Math.PI * Math.pow(raio, 2.0);

        JOptionPane.showMessageDialog(null, "A área do raio é " + areaCirculo);
    }
}