import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7:"));

        String diaSemana;
        switch(dia) {
            case 1: diaSemana = "Domingo"; break;
            case 2: diaSemana = "Segunda-feira"; break;
            case 3: diaSemana = "Terça-feira"; break;
            case 4: diaSemana = "Quarta-feira"; break;
            case 5: diaSemana = "Quinta-feira"; break;
            case 6: diaSemana = "Sexta-feira"; break;
            case 7: diaSemana = "Sábado"; break;
            default: diaSemana = "Dia inválido!";
        }

        JOptionPane.showMessageDialog(null, diaSemana);
    }
}