import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        int resultadoTabuada;

        String tabuada = "";


        for (int i = 1; i<=10; i++){
            resultadoTabuada = i * num;
            tabuada += i + " x " + num + " = " + resultadoTabuada + "\n";
        }

        String resultado = "Tabuada do " + num + "\n\n" + tabuada;
        JOptionPane.showMessageDialog(null, resultado);

    }
}