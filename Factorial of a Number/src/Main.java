public class Main {
    public static void main(String[] args) {

        int fac = factorial(5);
        System.out.println(fac);

    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}