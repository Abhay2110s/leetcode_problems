class Solution {
    public int minStartValue(int[] nums) {
         int sum = 0, minsum = 0;

        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            minsum = Math.min(minsum, sum);
        }

        if(minsum < 0)
            return 1 - minsum;

        return 1;
    }
}