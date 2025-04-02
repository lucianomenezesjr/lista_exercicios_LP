import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:"));

        double media = (n1 + n2) / 2;

        String resultado = "Média: " + media + "\n";
        resultado += (media < 50) ? "Reprovado" : "Aprovado";

        JOptionPane.showMessageDialog(null, resultado);
    }
}