package maxCommStr;

/**
 * 1、最大子序列和（连续）
 * 2、最长公共子串(连续）
 * 3、最长公共子序列（不连续）
 * 4、最长上升子序列（不连续）
 */
public class MaxCommStr {
    //最长公共子序列
    public static int commonStr(String s1,String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }

    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "badefgc";
        System.out.println(commonStr(s1, s2));
    }
}
