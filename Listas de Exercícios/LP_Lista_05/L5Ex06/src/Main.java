import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original array: " + Arrays.toString(v1));

        // In-place reversal
        for (int i = 0; i < v1.length / 2; i++) {
            int temp = v1[i];
            v1[i] = v1[v1.length - 1 - i];
            v1[v1.length - 1 - i] = temp;
        }

        System.out.println("Inverted array: " + Arrays.toString(v1));
    }
}