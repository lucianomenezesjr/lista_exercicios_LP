import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String menu = "Opções do menu:\n" +
                "5 - Saque\n" +
                "6 - Depósito\n" +
                "7 - Transferência\n" +
                "8 - Saldo\n" +
                "9 - Sair\n\n" +
                "Escolha uma opção (5-9):";

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

        if (opcao >= 5 && opcao <= 9) {
            JOptionPane.showMessageDialog(null, "Opção escolhida: " + opcao);
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida!");
        }
    }
}