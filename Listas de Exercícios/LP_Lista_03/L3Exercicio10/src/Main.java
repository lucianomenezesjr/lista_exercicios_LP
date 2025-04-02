import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        int num3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));

        int[] numeros = {num1, num2, num3};
        Arrays.sort(numeros);

        JOptionPane.showMessageDialog(null, "Números ordenados: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}