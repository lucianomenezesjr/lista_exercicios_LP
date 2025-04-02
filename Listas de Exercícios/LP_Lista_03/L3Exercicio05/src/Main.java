import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1:"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2:"));

        double media = (n1 + n2) / 2;

        String conceito;
        if (media >= 8.5) conceito = "A";
        else if (media >= 7) conceito = "B";
        else if (media >= 5) conceito = "C";
        else conceito = "D";

        JOptionPane.showMessageDialog(null,
                "Média: " + media + "\nConceito: " + conceito);
    }
}