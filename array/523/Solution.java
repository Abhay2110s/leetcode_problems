public class Solution {
     public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        for(int i = 0 ;i<n ;i++){
            int prefix = 0;
            for(int j = i ;j<n ;j++){
                prefix += nums[i];
                if(j-i+1>=2 && prefix%k == 0){
                    return true;
                }
            }
        }
        return false;
     }
}
