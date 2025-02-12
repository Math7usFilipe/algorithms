public class Main {
    public static void main(String[] args) {
        /*
        * Problem:
        * Give a number "n", find the first "N" elements of the Fibonacci sequence
        */

        int[] fibonacciSequence = fibonacci(3);

        for(int n : fibonacciSequence) {
            System.out.println(n + " ");
        }

    }

    public static int[] fibonacci(int n){
        if(n <= 0) {
            return new int[0];
        }

        int[] fib = new int[n];

        if(n >= 1) {
            fib[0] = 0;
        }
        if(n >= 2) {
            fib[1] = 1;
        }

        for(int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
}