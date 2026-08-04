class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0 , r = 0 , maxlength = 0;
        int n = nums.length , zeros =0 ;

        for(r =0 ; r<n ;r++){
            if(nums[r] == 0){
                zeros++;
            }
            while(zeros > 1){
                if(nums[l] == 0){
                    zeros--;
                }
                l++;
            }
            maxlength = Math.max(maxlength,r-l+1);
        }
        return maxlength - 1;
    }
}