public class Main {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;
        int gcd = gcd(a, b);
        System.out.println("O GCD de " + a + " e " + b + " é " + gcd);
    }

    public static int gcd(int a, int b) {
        if(b == 0){
            return a;
        }else {
            return gcd(b, a % b);
        }
    }

}