class Solution {

    static final int MOD = 1_000_000_007;

    private long kadane(int[] arr, int time) {

        long curr = 0;
        long maxsum = 0;

        for (int t = 0; t < time; t++) {

            for (int num : arr) {

                curr += num;

                if (curr < 0) {
                    curr = 0;
                }

                maxsum = Math.max(curr, maxsum);
            }
        }

        return maxsum;
    }

    public int kConcatenationMaxSum(int[] arr, int k) {

        long sum = 0;

        for (int num : arr) {
            sum += num;
        }

        if (k == 1) {
            return (int) (kadane(arr, 1) % MOD);
        }

        long ans = kadane(arr, 2);

        if (sum > 0) {
            ans += (long) (k - 2) * sum;
        }

        return (int) (ans % MOD);
    }
}