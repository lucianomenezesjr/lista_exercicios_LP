public class Main {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 9, 11, 13};
        int left = 0;
        int right = array.length -1;
        int expectedValue = 11;
        String resultado = "-1";

        while(left <= right){

            int half = (left + right)/2;

            if(array[half] == expectedValue){
                resultado = "O valor foi encontrado na posição " + half;
                break;
            }
            else if(array[half] > expectedValue){
                right = half -1;

            }
            else{
                left = half + 1;
            }

        }
        System.out.println(resultado);



    }
}