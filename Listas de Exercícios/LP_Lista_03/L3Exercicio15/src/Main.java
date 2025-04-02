import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double dinheiro = Double.parseDouble(JOptionPane.showInputDialog("Insira o dinheiro: R$"));

        String menu = "Menu:\n" +
                "1. Café Expresso R$ 0,50\n" +
                "2. Café Longo R$ 1,00\n" +
                "3. Capuccino R$ 2,50\n" +
                "4. Chocolate R$ 2,00\n" +
                "Escolha uma opção:";

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        String bebida = "";
        double preco = 0;

        switch(opcao) {
            case 1: bebida = "Café Expresso"; preco = 0.50; break;
            case 2: bebida = "Café Longo"; preco = 1.00; break;
            case 3: bebida = "Capuccino"; preco = 2.50; break;
            case 4: bebida = "Chocolate"; preco = 2.00; break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                return;
        }

        if(dinheiro < preco) {
            JOptionPane.showMessageDialog(null, "Dinheiro insuficiente!");
            return;
        }

        double troco = dinheiro - preco;
        JOptionPane.showMessageDialog(null,
                "Bebida selecionada: " + bebida + "\nSeu Troco: R$ " + String.format("%.2f", troco));
    }
}