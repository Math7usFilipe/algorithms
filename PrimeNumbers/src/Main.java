public class Main {
    public static void main(String[] args) {

        boolean isPrime = isPrime(4);
        System.out.println(isPrime);

        boolean isPrimeOptmized = isPrimeOptmized(4);
        System.out.println(isPrimeOptmized);
    }

    public static boolean isPrime(int n) {
        if(n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Big-O O(sqrt(n))
    public static boolean isPrimeOptmized(int n) {
        if(n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}