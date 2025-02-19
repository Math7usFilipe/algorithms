public class Main {
    public static void main(String[] args) {
        int r = climbingStaircase(4);
        System.out.println(r);
    }

    public static int climbingStaircase(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1];
    }
}