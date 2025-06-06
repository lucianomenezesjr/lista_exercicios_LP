public class Main {
    public static void main(String[] args) {

        int num = 5;
        fatorial(num);

    }

    public static int fatorial(int n){

        int resultadoFatorial = 1;
        for(int i=n; i>0; i--){
            resultadoFatorial *= i;
        }
        System.out.println(n + "! = " + resultadoFatorial);
        return  0;
    }
}