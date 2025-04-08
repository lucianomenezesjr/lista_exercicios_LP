import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para calcular o fatorial:"));

        if (num < 0) {
            JOptionPane.showMessageDialog(null, "Fatorial não está definido para números negativos.");
            return;
        }

        long fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
        }

        JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é: " + fatorial);
    }
}