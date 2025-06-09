public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int valor = 11;
        int posicao = buscaBinariaRecursiva(array, valor, 0, array.length - 1);

        if (posicao == -1) {
            System.out.println("Valor não encontrado");
        } else {
            System.out.println("Valor encontrado na posição: " + posicao);
        }
    }

    public static int buscaBinariaRecursiva(int[] array, int valor, int esquerda, int direita) {
        if (esquerda > direita) {
            return -1;
        }

        int meio = (esquerda + direita) / 2;

        if (array[meio] == valor) {
            return meio;
        } else if (array[meio] > valor) {
            return buscaBinariaRecursiva(array, valor, esquerda, meio - 1);
        } else {
            return buscaBinariaRecursiva(array, valor, meio + 1, direita);
        }
    }
}