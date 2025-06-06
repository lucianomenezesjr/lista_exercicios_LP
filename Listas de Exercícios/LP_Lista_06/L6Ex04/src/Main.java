import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String palavraUsuario = JOptionPane.showInputDialog("Digite uma palavra e verifique se ela é um palíndromo:");
        palindromo(palavraUsuario);
        

    }

    public static String palindromo(String palavra){
        palavra = palavra.toLowerCase();
        String palavraInvertida = "";
        String ehPalindromo = "";
        String resultado = palavra + ehPalindromo + " é palíndromo";


        char[] palavraArray = palavra.toCharArray();

        for (int i=0; i< palavraArray.length; i++) {
            palavraInvertida += palavraArray[palavraArray.length - i - 1];

        }
        if(palavra.equals(palavraInvertida)){
            ehPalindromo = "";
            System.out.println(resultado);
        }
        else{
            ehPalindromo = " não";
            System.out.println(resultado);
        }
        return resultado;
    }

}