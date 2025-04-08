import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean jogarNovamente;

        do {
            jogarNovamente = false;
            boolean acertouTudo = true;

            // Loop pelas tabuadas de 1 a 10
            tabuada:
            for (int i = 1; i <= 10 && acertouTudo; i++) {
                // Loop pelas operações de 1 a 10
                for (int j = 1; j <= 10; j++) {
                    int resultadoCorreto = i * j;

                    // Pede a resposta do usuário
                    String respostaStr = JOptionPane.showInputDialog(
                            "Quanto é " + i + " x " + j + "?");

                    // Verifica se o usuário cancelou
                    if (respostaStr == null) {
                        acertouTudo = false;
                        break tabuada;
                    }

                    try {
                        int respostaUsuario = Integer.parseInt(respostaStr);

                        // Verifica se a resposta está correta
                        if (respostaUsuario != resultadoCorreto) {
                            acertouTudo = false;
                            JOptionPane.showMessageDialog(null,
                                    "Resposta incorreta! O jogo acabou.");
                            break tabuada;
                        }
                    } catch (NumberFormatException e) {
                        acertouTudo = false;
                        JOptionPane.showMessageDialog(null,
                                "Por favor, digite um número válido! O jogo acabou.");
                        break tabuada;
                    }
                }
            }

            // Mensagem final
            if (acertouTudo) {
                JOptionPane.showMessageDialog(null,
                        "Parabéns! Você completou toda a tabuada sem erros!");
            }

            // Pergunta se quer jogar novamente
            int opcao = JOptionPane.showConfirmDialog(null,
                    "Deseja jogar novamente?", "Jogo da Tabuada",
                    JOptionPane.YES_NO_OPTION);

            jogarNovamente = (opcao == JOptionPane.YES_OPTION);

        } while (jogarNovamente);

        JOptionPane.showMessageDialog(null, "Obrigado por jogar!");
    }
}