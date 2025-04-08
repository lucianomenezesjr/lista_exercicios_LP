import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        String numerosIntervalo = "Números entre " + menor + " e " + maior + ":\n";

        for (int i = menor + 1; i < maior; i++) {
            numerosIntervalo += i + " ";
        }

        JOptionPane.showMessageDialog(null, numerosIntervalo);
    }
}