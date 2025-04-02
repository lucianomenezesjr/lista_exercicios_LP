import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        Integer x1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a raiz x1: "));
        Integer x2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a raiz x2: "));

        Integer coeficienteA = 1;
        Integer coeficienteB = ((x1 + x2) * (-1));
        Integer coeficienteC = x1 * x2;

        String coeficienteB_str = String.valueOf(coeficienteB);
        String coeficienteC_str = String.valueOf(coeficienteC);
        if (coeficienteB > 0){
            coeficienteB_str = "+ " + coeficienteB;
        }
        else if (coeficienteC > 0){
            coeficienteC_str = "+ " + coeficienteC;
        }
        JOptionPane.showMessageDialog(null, "Os coeficientes da equação do segundo grau são: \n" +
                "a = " + coeficienteA + ", b = " + coeficienteB + " e c = " + coeficienteC +
                "\nEquação completa: \n" +
                "x2 " + coeficienteB_str + "x " + coeficienteC_str + " = 0");
    }
}