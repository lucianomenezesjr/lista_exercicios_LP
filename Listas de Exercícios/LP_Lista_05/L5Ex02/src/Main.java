public class Main {
    public static void main(String[] args) {

        int [] v1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String resultadoPar = "";
        String resultadoImpar = "";

        for(int i=0; i< v1.length; i++){
            if (v1[i] % 2 == 0){

                v1[i] += 2;
                resultadoPar += v1[i] + ", ";

            }
            else if(v1[i] %2 != 0){
                v1[i] *= 2;
                resultadoImpar += v1[i] + ", ";
            }
        }
        System.out.println("Números pares: " + resultadoPar + "\nNúmeros ímpares: " + resultadoImpar);

    }
}