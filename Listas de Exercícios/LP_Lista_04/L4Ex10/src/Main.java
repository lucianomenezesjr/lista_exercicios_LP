import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Solicita o número de termos ao usuário
        String input = JOptionPane.showInputDialog("Digite quantos termos da sequência de Fibonacci deseja gerar:");

        try {
            int n = Integer.parseInt(input);

            // Valida a entrada
            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número positivo maior que zero.");
                return;
            }

            // Gera a sequência
            StringBuilder sequencia = new StringBuilder("Sequência de Fibonacci com " + n + " termos:\n");

            long a = 0, b = 1;

            for (int i = 1; i <= n; i++) {
                sequencia.append(a).append(" ");
                long proximo = a + b;
                a = b;
                b = proximo;
            }

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, sequencia.toString());

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, digite um número inteiro válido.");
        }
    }
}