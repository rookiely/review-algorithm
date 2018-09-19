package maxCommStr;

public class MaxCommStr2 {
    //最长公共子串

    public static int commonStr2(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int result = 0;
        int[][] dp = new int[len1 + 1][len2 + 1];
        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Math.max(result, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "badefgc";
        System.out.println(commonStr2(s1, s2));
    }
}
