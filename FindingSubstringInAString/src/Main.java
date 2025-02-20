public class Main {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "zbcdfg";
        System.out.println(FindingTheLongestCommonSubstringInAnGivenString(s1, s2));
    }

    public static String FindingTheLongestCommonSubstringInAnGivenString(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        String LongestString = "";

        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > LongestString.length()) {
                        LongestString = s1.substring(i - dp[i][j], i);
                    }
                }else {
                    dp[i][j] = 0;
                }
            }
        }
        return LongestString;
    }

}