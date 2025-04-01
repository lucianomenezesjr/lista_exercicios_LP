import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double velocidadeInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade inicial: "));
        double aceleracao = Double.parseDouble(JOptionPane.showInputDialog("Digite a aceleração: "));
        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo em segundos para percorrer o percurso: "));

        double velocidadeFinal = (velocidadeInicial + (aceleracao*tempo));
        JOptionPane.showMessageDialog(null, "A velocidade final é " + velocidadeFinal);
    }
}