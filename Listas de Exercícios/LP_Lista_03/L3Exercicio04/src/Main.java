import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:"));

        double media = (n1 + n2) / 2;

        if (media >= 50) {
            JOptionPane.showMessageDialog(null, "Média: " + media + "\nAprovado");
        } else {
            double recuperacao = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite a nota de recuperação:"));

            double novaMedia = (media + recuperacao) / 2;

            String resultado = "Nova média: " + novaMedia + "\n";
            resultado += (novaMedia < 50) ? "Reprovado" : "Aprovado";

            JOptionPane.showMessageDialog(null, resultado);
        }
    }
}