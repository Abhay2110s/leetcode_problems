class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = 0 , sum=0;
        double max = -Double.MAX_VALUE;
        while(j < nums.length)
        {
            sum = sum + nums[j];
            if(j-i+1< k )
            {
                j++;
            }
            else if(j-i+1 == k)
            {
                max= Math.max(sum,max);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return max/k;
    }
}