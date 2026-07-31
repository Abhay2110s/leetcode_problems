public class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0 ;i <n ;i++){
            int prefix = 0;
            for(int j = i ;j<n ;j++){
                prefix += nums[j];
                if(prefix == k){
                    count++;
                }
            }
        }
        return count;
    }
}
