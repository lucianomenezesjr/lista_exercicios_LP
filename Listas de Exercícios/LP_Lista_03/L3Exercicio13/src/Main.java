import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String menu = "Menu:\n" +
                "1. Círculo\n" +
                "2. Triângulo Retângulo\n" +
                "3. Retângulo\n" +
                "Escolha uma opção:";

        int opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
        String resultado = "";

        switch(opcao) {
            case 1:
                double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio:"));
                double areaCirculo = Math.PI * raio * raio;
                double perimetroCirculo = 2 * Math.PI * raio;
                resultado = String.format("Área = %.2f\nPerímetro = %.2f", areaCirculo, perimetroCirculo);
                break;

            case 2:
                double base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura:"));
                double areaTriangulo = (base * altura) / 2;
                double perimetroTriangulo = base + altura + Math.sqrt(base*base + altura*altura);
                resultado = String.format("Área = %.2f\nPerímetro = %.2f", areaTriangulo, perimetroTriangulo);
                break;

            case 3:
                double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado 1:"));
                double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado 2:"));
                double areaRetangulo = lado1 * lado2;
                double perimetroRetangulo = 2 * (lado1 + lado2);
                resultado = String.format("Área = %.2f\nPerímetro = %.2f", areaRetangulo, perimetroRetangulo);
                break;

            default:
                resultado = "Opção inválida!";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}