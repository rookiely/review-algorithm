package maxIncreSeq;

public class MaxIncreSeq {

    public static int findMaxIncre(String str) {
        int[] dp = new int[str.length() + 1];
        int max = 0;
        for (int i = 1; i < str.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) < str.charAt(i)) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    if (max < dp[i]) {
                        max = dp[i];
                    }
                }
            }
        }
        return max + 1;
    }

    public static void main(String[] args) {
        String str = "2395628236502";
        System.out.println(findMaxIncre(str));
    }
}
