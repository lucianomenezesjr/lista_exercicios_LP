import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        String menu = "Menu:\n" +
                "1. Soma\n" +
                "2. Subtração\n" +
                "3. Multiplicação\n" +
                "4. Divisão\n" +
                "Escolha uma opção:";

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        double resultado = 0;
        String operacao = "";

        switch(opcao) {
            case 1:
                resultado = num1 + num2;
                operacao = "+";
                break;
            case 2:
                resultado = num1 - num2;
                operacao = "-";
                break;
            case 3:
                resultado = num1 * num2;
                operacao = "×";
                break;
            case 4:
                resultado = num1 / num2;
                operacao = "÷";
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                return;
        }

        JOptionPane.showMessageDialog(null,
                String.format("Resultado: %.1f %s %.1f = %.1f", num1, operacao, num2, resultado));
    }
}