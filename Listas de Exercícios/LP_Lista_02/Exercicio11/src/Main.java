import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double nota01 = Double.parseDouble(JOptionPane.showInputDialog("Digite uma nota: "));
        double nota02 = Double.parseDouble(JOptionPane.showInputDialog("Digite mais uma nota: "));

        if ((nota01 <= 10 && nota01 >=0)|| (nota02 <= 10 && nota02 >=0) ){
            double media = (nota01 + (nota02*2))/(2+1);

            JOptionPane.showMessageDialog(null, "A média das notas é " + media);
        }
        else {
            JOptionPane.showMessageDialog(null, "A média deve estar entre 0 e 10");
        }

    }
}