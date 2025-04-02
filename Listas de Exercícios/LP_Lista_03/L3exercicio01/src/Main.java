import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Digite um número real:");
        double numero = Double.parseDouble(input);

        if (numero >= 0) {
            JOptionPane.showMessageDialog(null, "Raiz quadrada: " + Math.sqrt(numero));
        } else {
            JOptionPane.showMessageDialog(null, "Valor inválido!");
        }


    }
}