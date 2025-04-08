import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int resultadoTabuada;
        String tabuada = "", resultadoTabuadas = "", resultado = "";

        for(int i = 1; i <= 10; i ++){

            tabuada = "";

            for (int j = 1; j<=10; j++){
                resultadoTabuada = j * i;
                tabuada += j + " x " + i + " = " + resultadoTabuada + "\n";
            }
            resultadoTabuadas += "\nTabuada do " + i + "\n\n" + tabuada;
        }

        resultado = "Tabuadas do 1 ao 10\n" + resultadoTabuadas;
        System.out.println(resultado);
    }
}