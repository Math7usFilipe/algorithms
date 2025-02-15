public class Main {
    public static void main(String[] args) {

        boolean ispt = isPowerOfTwo(3);
        System.out.println(ispt);

        boolean isptbw = isPowerOfTwoBitWise(3);
        System.out.println(isptbw);

    }

    public static boolean isPowerOfTwoBitWise(int n) {
        if(n < 1) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static boolean isPowerOfTwo(int n) {
        if(n < 1) {
            return false;
        }
        while(n > 1) {
            if (n % 2 != 0) {
                return false;
            }
            n = n/2;
        }
        return true;
    }
}