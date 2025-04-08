import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            JOptionPane.showMessageDialog(null, num + " é primo!");
        } else {
            JOptionPane.showMessageDialog(null, num + " não é primo!");
        }
    }
}