class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0 , r = 0, zeros = 0 , maxlength = 0;
        int n = nums.length;
        for(r = 0 ; r<n ;r++){
            if(nums[r] == 0){
                zeros++;
            }
            while(zeros > k){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }
            maxlength = Math.max(maxlength , r-l+1);
        }
        return maxlength;
    }
}