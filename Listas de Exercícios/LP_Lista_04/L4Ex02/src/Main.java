import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int maior = Integer.MIN_VALUE, num;
        String resultado = "";

        for (int i = 0; i<4; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            if(maior < num){
                maior = num;
            }
        }
        resultado = "O maior número é " + maior;
        JOptionPane.showMessageDialog(null, resultado);
    }
}