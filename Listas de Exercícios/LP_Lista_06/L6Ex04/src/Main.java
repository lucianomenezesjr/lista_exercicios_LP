import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String palavra = JOptionPane.showInputDialog("Digite uma palavra e verifique se ela é um palíndromo:");
        palindromo(palavra);

        boolean ehPalindromo = palindromoRecursivo(palavra.toLowerCase(), 0, palavra.length() - 1);
        System.out.println(palavra + (ehPalindromo ? " é" : " não é") + " palíndromo");
        

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

    public static boolean palindromoRecursivo(String palavra, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (palavra.charAt(inicio) != palavra.charAt(fim)) {
            return false;
        }
        return palindromoRecursivo(palavra, inicio + 1, fim - 1);
    }

}