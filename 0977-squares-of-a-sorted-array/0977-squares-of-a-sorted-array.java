class Solution {
    public int[] sortedSquares(int[] nums) {
        int []res = new int[nums.length];
        int i = 0 ;
        int j = nums.length-1;
        int k = nums.length-1;

        while(i<=j)
        {
            int sqi = nums[i]*nums[i];
            int sqj = nums[j]*nums[j];
            
            if(sqi>sqj)
            {
                res[k] = sqi;
                i++;
            }
            else{
                res[k]=sqj;
                j--;
            }
            k--;
        }
        return res;
    }
}