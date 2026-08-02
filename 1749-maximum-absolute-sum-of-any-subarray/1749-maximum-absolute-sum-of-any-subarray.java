class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = 0 , minSum = 0 , maxval = 0 , minval = 0;

        for(int num : nums){
            maxSum += num;

            if(maxSum < 0){
                maxSum = 0;
            }

            maxval = Math.max(maxval,maxSum);


            minSum += num;

            if(minSum > 0){
                minSum = 0;
            }
            
            minval = Math.min(minval,minSum);
        }

        return Math.max(maxval,Math.abs(minval));
    }
}