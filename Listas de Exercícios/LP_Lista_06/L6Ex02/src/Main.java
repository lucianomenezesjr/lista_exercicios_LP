public class Main {
    public static void main(String[] args) {

        int num = 5;
        fatorial(num);

        int fat = fatorialRecursivo(num);
        System.out.println(num + "! = " + fat);

    }

    public static int fatorial(int n){

        int resultadoFatorial = 1;
        for(int i=n; i>0; i--){
            resultadoFatorial *= i;
        }
        System.out.println(n + "! = " + resultadoFatorial);
        return  0;
    }

    public static int fatorialRecursivo(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }
}