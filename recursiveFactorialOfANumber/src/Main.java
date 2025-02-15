public class Main {
    public static void main(String[] args) {
        int rf = recursiveFactorial(5);
        System.out.println(rf);
    }

    public static int recursiveFactorial(int n) {
        if(n == 0) {
            return 1;
        }
        return n * recursiveFactorial(n -1);
    }
}