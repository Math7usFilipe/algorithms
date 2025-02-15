public class Main {
    public static void main(String[] args) {
        int rfs = recursiveFibonacci(6);
        System.out.println(rfs);
    }

    public static int recursiveFibonacci(int n) {
        if(n < 2) {
            return n;
        }
        return recursiveFibonacci(n -1) + recursiveFibonacci(n -2);
    }
}