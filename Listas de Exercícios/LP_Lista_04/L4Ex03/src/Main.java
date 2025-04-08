import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String divPorQuatro = "";
        String resultado;
        for (int i = 0; i <200; i++){

            if((i % 4) == 0){
               divPorQuatro += i + ", ";
            }
        }
        resultado = "Números divisíveis por 4: " + divPorQuatro;
        JOptionPane.showMessageDialog(null, resultado);
    }
}