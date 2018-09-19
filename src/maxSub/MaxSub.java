package maxSub;

/**
 * 求最大子序列和（这里必然是连续的）
 */
public class MaxSub {

    /**
     * 设a[i]为和最大序列的起点，则如果a[i]是负的，那么它不可能代表最优序列的起点，
     * 因为任何包含a[i]作为起点的子序列都可以通过a[i+1]作起点而得到改进。
     * 任何负的子序列也不可能是最优子序列的前缀。
     * @param arr
     * @return
     */
    public int maxSubSum(int[] arr) {
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }
}
