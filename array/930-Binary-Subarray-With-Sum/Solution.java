// O(N2)

public class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0 , prefix = 0;
        for(int i = 0 ;i<nums.length ; i++){
            prefix = 0;
            for(int j = i ; j <nums.length ; j++){
                prefix += nums[j];
                if(prefix == goal){
                    count++;
                }
            }
        }
        return count;
    }
}
