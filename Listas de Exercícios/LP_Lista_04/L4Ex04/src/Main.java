public class Main {
    public static void main(String[] args) {

        double f;

        for (int i = -80; i <= 80; i = i + 10){
            f = 9/((5 * i) + 32);
            System.out.println(f);
        }
    }
}