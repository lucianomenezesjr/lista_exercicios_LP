import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da compra:"));

        String menuPagamento = "Menu:\n" +
                "1. Débito\n" +
                "2. Pix\n" +
                "3. Crédito\n" +
                "Escolha a forma de pagamento:";

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menuPagamento));
        double valorFinal = valorCompra;
        String mensagem = "";

        switch(opcao) {
            case 1:
                valorFinal = valorCompra * 0.95;
                mensagem = "Débito selecionado\nDesconto de 5%";
                break;

            case 2:
                valorFinal = valorCompra * 0.90;
                mensagem = "Pix selecionado\nDesconto de 10%";
                break;

            case 3:
                int parcelas = Integer.parseInt(JOptionPane.showInputDialog("Escolha o número de parcelas (1-10):"));
                if(parcelas <= 4) {
                    valorFinal = valorCompra * 1.02;
                    mensagem = "Crédito selecionado\nTaxa de 2%";
                } else {
                    valorFinal = valorCompra * 1.05;
                    mensagem = "Crédito selecionado\nTaxa de 5%";
                }
                mensagem += "\nParcelado em " + parcelas + "x";
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                return;
        }

        JOptionPane.showMessageDialog(null,
                mensagem + "\nValor final da compra: R$ " + String.format("%.2f", valorFinal));
    }
}